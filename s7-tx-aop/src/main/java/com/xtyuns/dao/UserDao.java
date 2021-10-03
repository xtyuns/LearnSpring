package com.xtyuns.dao;

import java.sql.SQLException;

public interface UserDao {
    Boolean UpdateUserOfAgeById(int id, int age) throws SQLException;
}
