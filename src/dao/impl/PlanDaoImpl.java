package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IPlanDao;
import entity.plan;
import tool.DBTool;

public class PlanDaoImpl implements IPlanDao {

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from plan";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs  =null;
		int count = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBTool.closeConnection(conn, pstmt, rs);
		}
		
		return count;
	}

	@Override
	public List<plan> getAllout(int pageNum, int nums) {
		// TODO Auto-generated method stub
		List<plan> lists=new ArrayList<>();
		String sql="select * from plan limit ?,?";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs  =null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (pageNum-1)*nums);
			pstmt.setInt(2, nums);
			rs = pstmt.executeQuery();
			String i;
			String l;
			while(rs.next()){
				l=rs.getFloat(7)*100+""+"%";
				i=rs.getFloat(10)*100+""+"%";
				plan pl=new plan(rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5), rs.getInt(6), l, rs.getInt(8), rs.getInt(9),i , rs.getString(11), rs.getString(12));
				lists.add(pl);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBTool.closeConnection(conn, pstmt, rs);
		}
		return lists;
	}

}
