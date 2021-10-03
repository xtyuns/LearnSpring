package com.xtyuns;

import com.xtyuns.dao.impl.BankDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        BankDaoImpl bankDao = ctx.getBean(BankDaoImpl.class);
        bankDao.selectMoney();
    }
}
