package com.xtyuns.factory;

import com.xtyuns.pojo.User;

public class StaticUserFactory {
    public static User getInstance() {
        return new User();
    }
}
