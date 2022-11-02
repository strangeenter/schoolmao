package com.mao.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


/**
 * 
 * Druid 数据库连接池
 *
 */
public class DataSourceUtils {
	private static DataSource dataSource = null;
	static {
		try {
			// 加载配置文件
			Properties prop =new Properties();
			prop.load(new FileInputStream("J:\\work\\schoolmao\\userCrud\\src\\main\\resources\\druid.properties"));
			dataSource = DruidDataSourceFactory.createDataSource(prop);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	};;
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

	public static DataSource getDataSource() {
		return dataSource;
	}
	/**
	 * 当DBUtils需要手动控制事务时，调用该方法获得一个连接
	 * 	 * @return
	 * 	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		Connection con = tl.get();
		if (con == null) {
			con = dataSource.getConnection();
			tl.set(con);
		}
		return con;
	}
	/**
	 * 开启事务
	 * @throws SQLException
	 */
	public static void startTransaction() throws SQLException {
		Connection con = getConnection();
		if (con != null)
			con.setAutoCommit(false);
	}
	/**
	 * 从ThreadLocal中释放并且关闭Connection,并结束事务
	 * @throws SQLException
	 */
	public static void releaseAndCloseConnection() throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			con.commit();
			tl.remove();
			con.close();
		}
	}
	/**
	 *回滚事务
	 * @throws SQLException 
	 */
	public static void rollback() throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			con.rollback();
		}
	}
}
