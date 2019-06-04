package com.thompson;

import com.thompson.mapper.UserMapper;
import com.thompson.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisMain {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(MyBatisMain.class);
        InputStream is = Resources.getResourceAsStream("mybatis.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User("daTang", "newPwd");
        mapper.selUsers();
       // System.out.println(users);
        mapper.updUser(user);

        logger.debug("dd");
        logger.info("dd");

    }
}
