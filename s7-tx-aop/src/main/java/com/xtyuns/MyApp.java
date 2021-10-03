package com.xtyuns;

import com.xtyuns.service.UserService;
import com.xtyuns.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Random;

public class MyApp {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
          // Bean named 'userService' is expected to be of type 'com.xtyuns.service.impl.UserServiceImpl' but was actually of type 'com.sun.proxy.$Proxy14'
//        UserService userService = ctx.getBean("userService", UserServiceImpl.class);
        UserService userService = (UserService) ctx.getBean("userService");
        Boolean result = userService.modifyUserOfAgeById("1", String.valueOf(new Random().nextInt(50)));
        System.out.println(result);
    }
}
