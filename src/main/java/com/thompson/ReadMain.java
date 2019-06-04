package com.thompson;

import com.thompson.pojo.User;
import com.thompson.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ReadMain {
    static Logger logger = Logger.getLogger(Math.class);

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService service = ac.getBean("userService", UserService.class);
        List<User> users = service.getAllUsers();

    }
}
