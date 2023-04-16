package cn.bdu.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {

	private static DataSource dataSource = new ComboPooledDataSource();
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

	public static DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * 当DBUtils需要手动控制事务时，调用该方法获得一个连接
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
	 */
	public static void startTransaction() throws SQLException {
		Connection con = getConnection();
		if (con != null)
			con.setAutoCommit(false);
	}

	/**
	 * 从ThreadLocal中释放并且关闭Connection,并结束事务
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
	 * 事务回滚
	 */

	public static void rollback() throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			con.rollback();
		}
	}
}
