package com.mao.dao;


import com.mao.pojo.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserDao {
    boolean saveUser(User user) throws SQLException;

    ArrayList<User>  listUser();

    User getUser(Integer id) throws SQLException;

    boolean deleteUser(Integer id) throws SQLException;

    boolean updateUser(User user);

}
