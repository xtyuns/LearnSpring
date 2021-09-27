package com.xtyuns.pojo;

import org.springframework.stereotype.Component;

@Component("user4")
public class User {

    public User() {
        System.out.println(this.getClass() + " no param constructor()");
    }
}
