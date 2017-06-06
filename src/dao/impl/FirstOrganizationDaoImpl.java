package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tool.DBTool;
import dao.IFirstOrganizationDao;
import entity.Organization;
import entity.Post;

public class FirstOrganizationDaoImpl implements IFirstOrganizationDao{

	@Override
	public List<Organization> getAllfirst() {
		// TODO Auto-generated method stub
		List<Organization> list = new ArrayList<>();
		String sql = "select *from firstorg";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Organization organization = new Organization(rs.getInt(1), rs.getString(2));
				list.add(organization);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Organization> getAllSecond(int id) {
		// TODO Auto-generated method stub
		List<Organization> list = new ArrayList<>();
		String sql = "select *	from secondorg where sid=?";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Organization organization = new Organization(rs.getInt(1), rs.getString(2));
				list.add(organization);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Organization> getAllThird(int id) {
		// TODO Auto-generated method stub
		List<Organization> list = new ArrayList<>();
		String sql = "select *from thirdorg where tid in(select tid from st where sid =?)";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Organization organization = new Organization(rs.getInt(1), rs.getString(2));
				list.add(organization);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Post> getAllfpost(int id) {
		// TODO Auto-generated method stub
		List<Post> list = new ArrayList<>();
		String sql = "select *from firstpost where fid=?";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Post post = new Post(rs.getInt(1), rs.getString(2));
				list.add(post);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Post> getAllspost(int id) {
		// TODO Auto-generated method stub
		List<Post> list = new ArrayList<>();
		String sql = "select id,sname from secondpost where sid=?";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Post post = new Post(rs.getInt(1), rs.getString(2));
				list.add(post);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Post> getAlltpost(int id) {
		// TODO Auto-generated method stub
		List<Post> list = new ArrayList<>();
		String sql = "select *from thirdpost where tid=?";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Post post = new Post(rs.getInt(1), rs.getString(2));
				list.add(post);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
