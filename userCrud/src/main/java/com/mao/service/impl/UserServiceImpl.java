package com.mao.service.impl;

import com.mao.dao.UserDao;
import com.mao.dao.impl.UserDaoImpl;
import com.mao.pojo.User;
import com.mao.service.UserService;

import java.sql.SQLException;
import java.util.ArrayList;

//实现接口用implements
//alt+回车实现方法
public class UserServiceImpl implements UserService {
    private UserDao userDao= new UserDaoImpl();

    /**
     * @param user
     * @return
     */
    @Override
    public Boolean RegisterUser(User user) {
        UserDao userDao = new UserDaoImpl();
        Boolean res = false;
        try {
            Boolean b = userDao.saveUser(user);
            if (b){
                res = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    @Override
    public ArrayList<User> listuser() {
        return null;
    }

    @Override
    public User getUser(Integer id) {
        User user = null;
        try {
            user = userDao.getUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public boolean deleteUser(Integer id) {
        try {
            return userDao.deleteUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }
}
