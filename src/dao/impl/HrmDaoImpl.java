package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tool.DBTool;
import dao.IHrmDao;
import entity.Hrm;
import entity.PostI;

public class HrmDaoImpl implements IHrmDao{

	@Override
	public int addAllHrm(Hrm hrm) {
		// TODO Auto-generated method stub
		int result=0;
		String sql = "insert into CampusInfo(id,firstorg,secondorg,thirdorg,"
				+ "name,filing_time,major,pnum,"
				+ "phone1,phone2,qq,email) values (?,?,?,?,?,?,?,?,?,?,?,?);";
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
			pstmt.setInt(1,hrm.getId());
			pstmt.setString(2, hrm.getFirstorg());
			pstmt.setString(3, hrm.getSecondorg());
			pstmt.setString(4, hrm.getThirdorg());
			pstmt.setString(5, hrm.getName());
			java.sql.Date date= new java.sql.Date(hrm.getFilingTime().getTime());
			pstmt.setDate(6, date);
			pstmt.setString(7, hrm.getMajor());
			pstmt.setInt(8, hrm.getPnum());
			pstmt.setString(9,hrm.getPhone1());
			pstmt.setString(10, hrm.getPhone2());
			pstmt.setString(11, hrm.getQq());
			
			pstmt.setString(12,hrm.getEmail());
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
	public List<Hrm> selectAllCampus() {
		// TODO Auto-generated method stub
		List<Hrm> hrms = new ArrayList<>();
		String sql = "select *from CampusInfo";
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
				Hrm hrmss = new Hrm(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
				hrms.add(hrmss);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return hrms;
	}
	
}
