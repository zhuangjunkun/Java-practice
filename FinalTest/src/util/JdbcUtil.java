package util;



/**
 * JDBC事物操作类
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库用户名密码的初始化<br/>
 * 数据库驱动的加载
 * @author Administrator
 *
 */
public class JdbcUtil {
//	private static String user = "root";
//	private static String password = "123456";
//	private static String url = "jdbc:mysql://localhost:3306/crm";
//	static {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new RuntimeException("加载数据库驱动异常");
//		}
	private static String user = "root";
	private static String password = "123456";
	private static String url = "jdbc:mysql://localhost:3306/test";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("加载数据库驱动异常");
		}
	}

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 更新数据库
	 * @param sql要更新的字符串
	 * @return
	 */

	public static int executeUpdate(String sql) {
		Connection conn = null;
		Statement stmt = null;
		int rowCount = 0;
		try {
			conn = JdbcUtil.getConn();
			stmt = conn.createStatement();
			rowCount = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeResource(stmt, conn);
		}
		return rowCount;
	}

	/**
	 * 使用PreparedStatement更新数据库
	 * @param sql要更新的字符串<br/>
	 * @param paramArray要更新的参数
	 * @return
	 */
	public static int executeUpdate_Pre(String sql, Object[] paramArray) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = JdbcUtil.getConn();
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < paramArray.length; i++) {
				pstmt.setObject(i + 1, paramArray[i]);
			}
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeResource(pstmt, conn);
		}
		return rowCount;
	}

	/**
	 * 事务的操作
	 * 
	 * @return
	 */
	public static boolean executeTransaction(String[] sqlArray) {
		Connection conn = null;
		Statement stmt = null;
		boolean flag = false;
		try {
			conn = JdbcUtil.getConn();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			for (String sql : sqlArray) {
				stmt.addBatch(sql);
			}
			stmt.executeBatch();
			conn.commit();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JdbcUtil.closeResource(stmt, conn);
		}
		return flag;
	}

	/**
	 *利用结果集元素 获取数据库信息
	 * @param sql
	 * @return
	 */
	public static List<Map<String, Object>> executeQuery(String sql) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		Map<String, Object> rowMap = null;
		ResultSetMetaData metaData = null;
		try {
			conn = JdbcUtil.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 结果集的元数据
			metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while (rs.next()) {
				rowMap = new HashMap<String, Object>();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnName(i).toLowerCase();
				
						Object columnValue = rs.getObject(columnName);
						rowMap.put(columnName, columnValue);
					}
				}
				dataList.add(rowMap);
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeResource(rs, stmt, conn);
		}
		return dataList;
	}

	/**
	 * 获取数据库的信息
	 * @param sql
	 * @return
	 */
	public static Map<String, Object> executeQuerySingle(String sql) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, Object> rowMap = null;
		ResultSetMetaData metaData = null;
		try {
			conn = JdbcUtil.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 结果集的元数据
			metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			if (rs.next()) {
				rowMap = new HashMap<String, Object>();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnName(i).toLowerCase();
					Object columnValue = rs.getObject(columnName);
					rowMap.put(columnName, columnValue);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeResource(rs, stmt, conn);
		}
		return rowMap;
	}

	/**
	 * 关闭数据连接
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	public static void closeResource(ResultSet rs, Statement stmt,
			Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		rs = null;

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		stmt = null;

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
	}

	/**
	 * 关闭数据库的连接
	 * @param stmt
	 * @param conn
	 */
	public static void closeResource(Statement stmt, Connection conn) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		stmt = null;

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
	}




	public static void main(String[] args) {
		JdbcUtil dbutil = new JdbcUtil();
		try {
			dbutil.getConn();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
