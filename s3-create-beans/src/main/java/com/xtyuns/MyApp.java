package com.xtyuns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-content.xml");

        System.out.println("beans count: " + app.getBeanDefinitionCount());

        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
