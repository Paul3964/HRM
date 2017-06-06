package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IQueryDao;
import entity.Staff;
import tool.DBTool;

public class QueryDaoImpl implements IQueryDao {

	@Override
	public List<Staff> getEmplyee(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "select e.file_number,e.name,e.gender,fio.fname,sio.sname,tio.tname,fip.fname,sip.sname,e.states from employee e,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip where e.foid=fio.fid and e.soid=sio.id and e.toid=tio.tid and e.fpid=fip.fid and e.spid=sip.id and  states='已复核'and e.file_number=?";
		List<Staff> lists = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
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

}
