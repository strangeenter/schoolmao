package com.mao.dao.impl;

import com.mao.dao.UserDao;
import com.mao.pojo.User;
import com.mao.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao {

    private  DataSource dataSource = DataSourceUtils.getDataSource();
    @Override
    public boolean saveUser(User user) throws SQLException {

        // 获得QueryRunner对象
        QueryRunner runner = new QueryRunner(dataSource);
        // sql语句
        String sql = "insert into user(name,password,email,birthday) values(?,?,?,?)";
        // 执行
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        int row = runner.update(sql, user.getName(), user.getPassword(), user.getEmail(), sdf.format(user.getDate()));
        if (row > 0) {
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<User> listUser() {
        QueryRunner runner = new QueryRunner(dataSource);
        String sql = "insert into user(name,password,email,birthday) values(?,?,?,?)";
        return null;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public boolean deleteUser(Integer id) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }
}
