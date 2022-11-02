package com.mao.dao.impl;

import com.mao.dao.UserDao;
import com.mao.pojo.User;
import com.mao.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.text.ParseException;
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
    public User getUser(Integer id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "select id,name,email,birthday from user where id = ?";
        Object[] params = {id};
        Object[] query = queryRunner.query(dataSource.getConnection(), sql, new ArrayHandler(),params);
        User user = new User();
        user.setId(Integer.valueOf(query[0].toString()));
        user.setName(query[1].toString());
        user.setEmail(query[2].toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            user.setDate(simpleDateFormat.parse(query[3].toString()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return user ;
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
