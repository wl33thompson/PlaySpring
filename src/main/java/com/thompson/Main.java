package com.thompson;

import com.thompson.mapper.UserMapper;
import com.thompson.pojo.User;
import com.thompson.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static Logger logger = Logger.getLogger(Math.class);

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService service = ac.getBean("userService", UserService.class);
        User user = new User("daTang","20190603---");
        service.updUser(user);



    }
}
