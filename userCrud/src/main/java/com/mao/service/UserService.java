package com.mao.service;

import com.mao.pojo.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserService {
    //在接口里建一个方法
    Boolean RegisterUser(User user) throws SQLException;
    ArrayList<User> listuser();
    User getUser (Integer id);
    boolean deleteUser(Integer id);
    boolean updateUser(User user);
}
