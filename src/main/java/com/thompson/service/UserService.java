package com.thompson.service;

import com.thompson.mapper.UserMapper;
import com.thompson.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void updUser(User user) {
        System.out.println("########### START ##########");

        userMapper.updUser(user);
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("########### END ##########");
    }

    public List<User> getAllUsers() {
        System.out.println("########### START READ##########");

        List<User> users = null;
        for (int i = 0; i < 10; i++) {
            users = userMapper.selUsers();
            for (User user : users) {
                System.out.println(user);
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("########### END ##########");

        return users;

    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
