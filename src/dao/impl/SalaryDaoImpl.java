package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.ISalaryDao;
import entity.Salary;
import tool.DBTool;

public class SalaryDaoImpl implements ISalaryDao {



	@Override
	public int saveSaveSalary(Salary s) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		try {
			conn = DBTool.dataSource.getConnection();
			String sql = "insert into salary (number,post,count,markes,registrant,time,standard,travel,message,difirt,common,lunch,traffic,car) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, s.getNumber());
			ps.setString(2, s.getPost());
			ps.setFloat(3, s.getCount());
			ps.setString(4, s.getMarkes());
			ps.setString(5, s.getRegistrant());
			ps.setString(6, s.getTime());
			
			ps.setFloat(7, s.getStandard());
	
			ps.setFloat(8, s.getTravel());
			ps.setFloat(9, s.getMessage());
			ps.setFloat(10, s.getDrift());
			ps.setFloat(11, s.getCommon());
			ps.setFloat(12, s.getLunch());
			ps.setFloat(13, s.getTraffic());
			ps.setFloat(14, s.getCar());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		return count;
	}
	
	@Override
	public String getId() {
		Connection conn = null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String id = "";
		try {
			conn = DBTool.dataSource.getConnection();
			String sql = "select max(number)+1000 from salary";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				id = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		return id;
	}

	@Override
	public List<Salary> getAllstates(int pagNum,int nums) {
		List<Salary> lists = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBTool.dataSource.getConnection();
			String sql = "select number,post,markes,registrant,time from salary where states='待复核' limit ?,?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (pagNum-1)*nums);
			ps.setInt(2, nums);
			rs = ps.executeQuery();
			while(rs.next()){
				Salary s = new Salary(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				lists.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		return lists;
	}

	@Override
	public int getTotalCount() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "select count(*) from salary";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		return count;
	}

	@Override
	public List<Salary> showSalary(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Salary> lists = new ArrayList<>();
		try {
			conn = DBTool.dataSource.getConnection();
			String sql = "select * from salary where number=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
				Salary s = new Salary(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getFloat(7),rs.getFloat(8),rs.getFloat(9),rs.getFloat(10),rs.getFloat(11),rs.getFloat(12),rs.getFloat(13),rs.getFloat(14));
				lists.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		
		return lists;
	}

	@Override
	public int updateSalary(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "update salary set states='已复核' where number=?";
		int count = 0;
		try {
			conn = DBTool.dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		
		return count;
	}

	@Override
	public int insertSalary(int id,String message) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "update salary set review =? where number=?";
		Salary s = new Salary();
		int count = 0;
		try {
			conn = DBTool.dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, message);
			ps.setInt(2, id);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		return count;
	}

	@Override
	public int getCount(Salary s) {
		Connection conn  = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		String sql = "select count(*) from salary where 1=1";
		if(s.getNumber()!=-1){
			sql += " and number="+s.getNumber();
		}
		if(s.getPost()!=null&&!"".equals(s.getPost())){
			sql+=" and post like '%"+s.getPost()+"%'";
		}
		if(s.getMarkes()!=null&&!"".equals(s.getMarkes())){
			sql+=" and markes like '%"+s.getMarkes()+"%'";
		}
		if(s.getRegistrant()!=null&&!"".equals(s.getRegistrant())){
			sql+=" and registrant like '%"+s.getRegistrant()+"%'";
		}
		try {
			conn = DBTool.dataSource.getConnection();
			
			ps  = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		return count;	
	}

	@Override
	public List<Salary> getSalary(int PageNum, int nums, Salary s) {
		List<Salary> lists = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql= "select * from salary where 1=1";
		if(s.getNumber()!=-1){
			sql += " and number="+s.getNumber();
		}
		if(s.getPost()!=null&&!"".equals(s.getPost())){
			sql+=" and post like '%"+s.getPost()+"%'";
		}
		if(s.getMarkes()!=null&&!"".equals(s.getMarkes())){
			sql+=" and markes like '%"+s.getMarkes()+"%'";
		}
		if(s.getRegistrant()!=null&&!"".equals(s.getRegistrant())){
			sql+=" and registrant like '%"+s.getRegistrant()+"%'";
		}
		sql+=" limit ?,?";
		try {
			conn = DBTool.dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (PageNum-1)*nums);
			ps.setInt(2, nums);
			rs = ps.executeQuery();
			while(rs.next()){
				Salary ss = new Salary(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				lists.add(ss);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, ps, rs);
		}
		
		return lists;
		
	}
	
	

}
