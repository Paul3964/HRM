package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IAddThingDao;
import entity.Question;
import entity.hrm1;
import tool.DBTool;

public class AddThingDaoImpl implements IAddThingDao {

	@Override
	public int addting(String planname,String personname,float estimatedcost,int actualshou,int aimshou,String percentcompl,int aimcheng,int actualcheng,String percentconv,String starttime,String endtime) {
		// TODO Auto-generated method stub
		int count=0;
		String sql="insert into plan(planname,personname,estimatedcost,actualshou,aimshou,percentcompl,aimcheng,actualcheng,percentconv,starttime,endtime) values (?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, planname);
			pstmt.setString(2, personname);
			pstmt.setFloat(3, estimatedcost);
			pstmt.setInt(4, actualshou);
			pstmt.setInt(5, aimshou);
			pstmt.setString(6, percentcompl);
			pstmt.setInt(7, aimcheng);
			pstmt.setInt(8, aimcheng);
			pstmt.setString(9, percentconv);
			pstmt.setString(10, starttime);
			pstmt.setString(11, endtime);
			count=pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBTool.closeConnection(conn, pstmt,rs);
		}
		return count;
	}

	@Override
	public int addallDecition(hrm1 hrms) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "insert into course (id,address,aimcourse,ftestname,stestname,aimnum,actnum,createtime,stoptime) values (?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt =null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,0);
			pstmt.setString(2, hrms.getAddress());
			pstmt.setString(3, hrms.getAimcourse());
			pstmt.setString(4, hrms.getFtestname());
			pstmt.setString(5, hrms.getStestname());
			pstmt.setInt(6, hrms.getAimnum());
			pstmt.setInt(7, hrms.getActnum());
			pstmt.setString(8, hrms.getCreatetime());
			pstmt.setString(9, hrms.getStoptime());
			result=pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, null);
		}
		return result;
	}

	@Override
	public List<hrm1> Searchalldecision(hrm1 hrms) {
		// TODO Auto-generated method stub
		List<hrm1> hrm11 = new ArrayList<>();
		String sql = "select id, aimcourse, aimnum, actnum, createtime, stoptime, address, ftestname, stestname from course where "
				+ "aimcourse = ? and aimnum = ? and "
				+ "actnum = ? and createtime >= ? and"
				+ " stoptime <= ? and address = ? and"
				+ " ftestname = ? and stestname = ?";
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
			pstmt.setString(1, hrms.getAimcourse());
			pstmt.setInt(2, hrms.getAimnum());
			pstmt.setInt(3, hrms.getActnum());
			pstmt.setString(4, hrms.getCreatetime());
			pstmt.setString(5, hrms.getStoptime());
			pstmt.setString(6, hrms.getAddress());
			pstmt.setString(7, hrms.getFtestname());
			pstmt.setString(8, hrms.getStestname());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				hrm1 hrm12 = new hrm1(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
				hrm11.add(hrm12);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return hrm11;
	}

}
