package com.thompson.mapper;

import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import com.thompson.pojo.User;

import java.util.List;

@Component
public interface UserMapper {
//    @Update("update user set user_name=#{username},password=#{password} where user_name=#{username}")
     int updUser(User user);

     List<User> selUsers();
}
