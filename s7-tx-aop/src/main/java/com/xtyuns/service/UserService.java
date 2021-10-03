package com.xtyuns.service;

import java.sql.SQLException;

public interface UserService {
    Boolean modifyUserOfAgeById(String id, String age) throws SQLException;
}
