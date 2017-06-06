package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IdeleteDao;
import entity.Employee;
import entity.Staff;
import tool.DBTool;

public class DeleteDaoImpl implements IdeleteDao {
	@Override
	public int updateStates(int eid) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "update employee set states='已删除' where states<>'待复核' and file_number=?";
		Employee e1 = new Employee();
		int count = 0;
		try {
			ps = conn.prepareStatement(sql);
//			ps.setString(1, e1.getStates());
			ps.setInt(1, eid);
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
	public int getAllCount() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "select count(*) from employee where states<>'已删除'";
		int count = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public List<Staff> getAllEmployee(int pageNum, int nums) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "select e.file_number,e.name,e.gender,fio.fname,sio.sname,tio.tname,fip.fname,sip.sname,e.states from employee e,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip where e.foid=fio.fid and e.soid=sio.id and e.toid=tio.tid and e.fpid=fip.fid and e.spid=sip.id and e.states<>'已删除' limit ?,?";
		List<Staff> lists = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (pageNum-1)*nums);
			ps.setInt(2, nums);
			rs = ps.executeQuery();
			while(rs.next()){
				Staff s = new Staff(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
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
	public int updatestate(int eid) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		try {
			conn = DBTool.dataSource.getConnection();
			String sql = "update employee set states='已复核' where file_number=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, eid);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
