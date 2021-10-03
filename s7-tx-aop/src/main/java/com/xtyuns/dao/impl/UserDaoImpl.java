package com.xtyuns.dao.impl;

import com.xtyuns.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    DriverManagerDataSource driverManagerDataSource;

    @Override
    public Boolean UpdateUserOfAgeById(int id, int age) throws SQLException {
        Connection connection = driverManagerDataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("update user set age=? where id=?");
        preparedStatement.setInt(1, age);
        preparedStatement.setInt(2, id);
        int i = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        return i == 1;
    }
}
