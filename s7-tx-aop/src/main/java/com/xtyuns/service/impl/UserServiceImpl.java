package com.xtyuns.service.impl;

import com.xtyuns.dao.UserDao;
import com.xtyuns.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    public Boolean modifyUserOfAgeById(String id, String age) throws SQLException {
        return userDao.UpdateUserOfAgeById(Integer.parseInt(id), Integer.parseInt(age));
    }
}
