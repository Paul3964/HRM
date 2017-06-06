package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ILoginDao;
import entity.User;
import service.ILoginService;
import tool.DBTool;

public class LoginDaoImpl implements ILoginDao{

	@Override
	public List<User> selectUser(String username) {
		List<User> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			pstmt = conn.prepareStatement("select username,password,position from LoginInfo where username='"+username+"'");
			rs = pstmt.executeQuery();
			while(rs.next()){
				User u = new User(rs.getString(1), rs.getString(2),rs.getString(3));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
		}
		
		return list;

	}

	
}
