package tool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSource;
//import com.sun.org.apache.xerces.internal.impl.dv.xs.DurationDV;



public class DBTool {
	
	//数据源对象 （取连接对象）
	public static DruidDataSource dataSource = new DruidDataSource();
	static {
		Properties pro = new Properties();
		String driven = pro.getProperty("mysql.driven");
		try {
			//获取类加载路径中的配置文件 
			pro.load(DBTool.class.getResourceAsStream("/db.properties"));
			//设置属性
			dataSource.setDriverClassName(pro.getProperty("mysql.driver"));
			dataSource.setUrl(pro.getProperty("mysql.url"));
			dataSource.setUsername(pro.getProperty("mysql.username"));
			dataSource.setPassword(pro.getProperty("mysql.password"));
			//设置初始化连接个数
			dataSource.setInitialSize(Integer.parseInt(pro.getProperty("mysql.initialSize")));
			//设置连接池中最大连接个数
			dataSource.setMaxActive(Integer.parseInt(pro.getProperty("mysql.maxActive")));
			//设置连接池中最少连接个数
			dataSource.setMinIdle(Integer.parseInt(pro.getProperty("mysql.minIdle")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void closeConnection(Connection conn,PreparedStatement stmt,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn!=null){
			
			try {
				conn.close();//在这不是关闭  而是放回连接池
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	


}



