package dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tool.DBTool;
import dao.IRegisterDao;
import entity.orgpost;
import entity.Employee;
import entity.Organization;
import entity.Post;
import entity.Staff;

public class RegisterDaoImpl implements IRegisterDao {


	@Override
	public int saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int result=0;
		String sql = "insert into Employee (file_number,name,gender,Email,phone,QQ,"
				+ "mobile,address,registrant,postcode,nationality,"
				+ "birthplace,birthday,nation,resume,family,"
				+ "salary_standard,filing_time,account,notes,foid,"
				+ "soid,toid,fpid,spid,tpid,states) values(?,?,?,?,?"
				+ ",?,?,?,?,?,"
				+ "?,?,?,?,?"
				+ ",?,?,?,?,?,"
				+ "?,?,?,?,?,?,?"
				+ ")";
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
			pstmt.setInt(1,employee.getEid());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getGender());
			pstmt.setString(4, employee.getEmail());
			pstmt.setString(5, employee.getPhone());
			pstmt.setString(6, employee.getQQ());
			
			pstmt.setString(7, employee.getMobile());
			pstmt.setString(8, employee.getAddress());
			pstmt.setString(9, employee.getRegistrant());
			pstmt.setString(10, employee.getPostcode());
			pstmt.setString(11, employee.getNationality());
			
			pstmt.setString(12, employee.getBirthplace());
			java.sql.Date date= new java.sql.Date(employee.getBirthday().getTime());
			pstmt.setDate(13, date);
			pstmt.setString(14, employee.getNation());
			pstmt.setString(15, employee.getResume());
			pstmt.setString(16, employee.getFamily());
			
			pstmt.setString(17, employee.getSalary_standard());
			java.sql.Date date1 = new java.sql.Date(employee.getFiling_time().getTime());
			pstmt.setDate(18, date1);
			pstmt.setString(19, employee.getAccount());
			pstmt.setString(20, employee.getNotes());
			pstmt.setInt(21, employee.getFoid());
			pstmt.setInt(22, employee.getSoid());
			pstmt.setInt(23, employee.getToid());
			pstmt.setInt(24, employee.getFpid());
			pstmt.setInt(25, employee.getSpid());
			pstmt.setInt(26, employee.getTpid());
			pstmt.setString(27, "未审核");
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
	public int getTotalCount() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from employee";
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return count;
	}

	@Override
	public List<Employee> getEmplyee(int pageNum, int nums) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		String sql = "select file_number,name,gender,phone,registrant,nation,states from employee where states<>'已删除' limit ?,?";
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
			pstmt.setInt(1, (pageNum-1)*nums);
			pstmt.setInt(2, nums);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return employees;
	}



	@Override
	public Employee selectById(int file_number) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt =null;
		Employee employee=null;
		String sql="select * from employee where file_number=?";
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,file_number);
			rs=pstmt.executeQuery();
			while(rs.next()){
				employee=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),
				rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
				rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),
				rs.getString(12),rs.getDate(13),rs.getString(14),rs.getString(15),
				rs.getString(16),rs.getString(17),rs.getDate(18),rs.getString(19),
				rs.getString(20),rs.getInt(21),rs.getInt(22),rs.getInt(23),
				rs.getInt(24),rs.getInt(25),rs.getInt(26));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt =null;
		int count=0;
		String sql="update employee set name=?,gender=?,Email=?,phone=?,QQ=?,"
				+"mobile=?,address=?,registrant=?,postcode=?,nationality=?,"
				+ "birthplace=?,birthday=?,nation=?,resume=?,family=?,"
				+ "salary_standard=?,filing_time=?,account=?,notes=?,tpid=? where file_number= ?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,employee.getName());
			pstmt.setString(2,employee.getGender());
			pstmt.setString(3,employee.getEmail());
			pstmt.setString(4,employee.getPhone());
			pstmt.setString(5,employee.getQQ());
			pstmt.setString(6,employee.getMobile());
			pstmt.setString(7,employee.getAddress());
			pstmt.setString(8,employee.getRegistrant());
			pstmt.setString(9,employee.getPostcode());
			pstmt.setString(10,employee.getNationality());
			pstmt.setString(11,employee.getBirthplace());
			java.sql.Date birthday=new java.sql.Date(employee.getBirthday().getTime());
			pstmt.setDate(12,birthday);
			pstmt.setString(13,employee.getNation());
			pstmt.setString(14,employee.getResume());
			pstmt.setString(15,employee.getFamily());
			pstmt.setString(16,employee.getSalary_standard());
			java.sql.Date filing_time=new java.sql.Date(employee.getFiling_time().getTime());
			pstmt.setDate(17,filing_time);
			pstmt.setString(18,employee.getAccount());
			pstmt.setString(19,employee.getNotes());
			pstmt.setInt(20,employee.getTpid());
			pstmt.setInt(21, employee.getEid());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}
	
	@Override
	public int update1(Employee employee) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt =null;
		int count=0;
		String sql="update employee set name=?,foid=?,soid=?,toid=?,fpid=?,spid=? where file_number=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,employee.getName());
			pstmt.setInt(2,employee.getFoid());
			pstmt.setInt(3,employee.getSoid());
			pstmt.setInt(4,employee.getToid());
			pstmt.setInt(5,employee.getFpid());
			pstmt.setInt(6,employee.getSpid());
			pstmt.setInt(7,employee.getEid());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public int selectByName1(String firstorg) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select fid from firstorg where fname=?";
		int fid=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,firstorg);
			rs=pstmt.executeQuery();
			while(rs.next()){
				fid=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fid;
	}

	@Override
	public int selectByName2(String firstorg) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select id from secondorg where sname=?";
		int sid=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,firstorg);
			rs=pstmt.executeQuery();
			while(rs.next()){
				sid=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sid;
	}

	@Override
	public int selectByName3(String firstorg) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select tid from thirdorg where tname=?";
		int tid=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,firstorg);
			rs=pstmt.executeQuery();
			while(rs.next()){
				tid=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tid;
	}

	@Override
	public int selectByName4(String titile) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select id from firstpost where fname=?";
		int fid=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,titile);
			rs=pstmt.executeQuery();
			while(rs.next()){
				fid=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fid;
	}

	@Override
	public int selectByName5(String titile) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select id from secondpost where sname=?";
		int sid=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,titile);
			rs=pstmt.executeQuery();
			while(rs.next()){
				sid=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sid;
	}

	@Override
	public int selectByName6(String titile) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select id from thirdpost where tname=?";
		int tid=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,titile);
			rs=pstmt.executeQuery();
			while(rs.next()){
				tid=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tid;
	}

	@Override
	public List<Post> selectNameById(String sname) {
		// TODO Auto-generated method stub
		List<Post> list=new ArrayList<>();
		Connection conn = null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String tname=null;
		String sql="select tname from thirdpost where tid in (select id from secondpost where sname=?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sname);
			rs=pstmt.executeQuery();
			while(rs.next()){
				tname=rs.getString(1);
				Post post=new Post(tname);
				list.add(post);
			}
		} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Staff> selectByorg(int fid, int sid, int tid, int fpid, int spid, Date stime, Date etime) {
		// TODO Auto-generated method stub
		List<Staff> list=new ArrayList<Staff>();
		Connection conn=null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt =null;
		String sql="select  e.file_number,e.name,e.gender,fio.fname,sio.sname,tio.tname,fip.fname,sip.sname from employee e,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip where e.foid=fio.fid and e.soid=sio.id and e.toid=tio.tid and e.fpid=fip.id and e.spid=sip.id and e.filing_time>? and e.filing_time<?";
	    if(fid!=0){
			sql+=" and e.foid="+fid;
		}
		if(sid!=0){
			sql+=" and e.soid="+sid;
		}
	    if(tid!=0){
			sql+=" and e.toid="+tid;
		}
		if(fpid!=0){
			sql+=" and e.fpid="+fpid;
		}
		if(spid!=0){
			sql+=" and e.spid="+spid;
		}
			java.sql.Date stime1=new java.sql.Date(stime.getTime());
			java.sql.Date etime1=new java.sql.Date(etime.getTime());
	    ResultSet rs=null;
	    Staff staff=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setDate(1, stime1);
			pstmt.setDate(2, etime1);
			rs=pstmt.executeQuery();
			while(rs.next()){
				staff=new Staff(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				list.add(staff);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public orgpost selectOrgPost(int file_number) {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			conn = DBTool.dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
		PreparedStatement pstmt =null;
		String sql="select fio.fname,sio.sname,tio.tname,fip.fname,sip.sname,tip.tname from employee e,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip,thirdpost tip where e.foid=fio.fid and e.soid=sio.id and e.toid=tio.tid and e.fpid=fip.id and e.spid=sip.id and e.tpid=tip.id and e.file_number=?";
	    ResultSet rs=null;
	    orgpost op=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, file_number);
			rs=pstmt.executeQuery();
			while(rs.next()){
				op=new orgpost(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return op;
	}

}
