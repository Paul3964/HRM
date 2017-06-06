
	package dao.impl;

	import java.sql.Connection;

	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	import dao.IPostDao;
	import entity.Postjob;
	import entity.Resume;
	import entity.Staff;
	import entity.orgpost;
	import tool.DBTool;

	public class PostDaoImpl implements IPostDao {

		@Override
		public int insertPost(Postjob postjob) {
			// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement pstmt=null;
			int result=0;
			String sql="insert into postjob (foid,soid,toid,posttype,fpid,spid,personnumber,etime,register,filing_time,detail,demand) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, postjob.getFoid());
				pstmt.setInt(2, postjob.getSoid());
				pstmt.setInt(3, postjob.getToid());
				pstmt.setString(4, postjob.getPosttype());
				pstmt.setInt(5, postjob.getFpid());
				pstmt.setInt(6, postjob.getSpid());
				pstmt.setInt(7, postjob.getPersonnumber());
				java.sql.Date edate= new java.sql.Date(postjob.getEtime().getTime());
				pstmt.setDate(8, edate);
				pstmt.setString(9, postjob.getRegister());
				java.sql.Date filing_time= new java.sql.Date(postjob.getFiling_time().getTime());
				pstmt.setDate(10,filing_time);
				pstmt.setString(11, postjob.getDetail());
				pstmt.setString(12, postjob.getDemand());
				result=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}

		@Override
		public Postjob selectById(int id,int foid, int soid, int toid, int fpid, int spid) {
			// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			Postjob pj=null;
			String sql="select p.posttype,p.personnumber,p.etime,p.register,p.filing_time,p.detail,p.demand,fio.fname,sio.sname,tio.tname,fip.fname,sip.sname from Postjob p,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip where p.foid=fio.fid and p.soid=sio.id and p.toid=tio.tid and p.fpid=fip.id and p.spid=sip.id and p.id=? and p.foid=? and p.soid=? and p.toid=? and p.fpid=? and p.spid=?";
		    try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.setInt(2, foid);
				pstmt.setInt(3, soid);
				pstmt.setInt(4, toid);
				pstmt.setInt(5, fpid);
				pstmt.setInt(6, spid);
				rs=pstmt.executeQuery();
				while(rs.next()){
					pj=new Postjob(rs.getString(1),rs.getInt(2),rs.getDate(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return pj;
		}

		@Override
		public int Update(int id,Postjob postjob) {
			// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement pstmt=null;
			int count=0;
			String sql="Update postjob set posttype=?,personnumber=?,etime=?,register=?,filing_time=?,detail=?,demand=?,states=? where id=?";
		    try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,postjob.getPosttype());
				pstmt.setInt(2,postjob.getPersonnumber());
				java.sql.Date etime= new java.sql.Date(postjob.getEtime().getTime());
				pstmt.setDate(3,etime);
				pstmt.setString(4,postjob.getRegister());
				java.sql.Date filing_time= new java.sql.Date(postjob.getFiling_time().getTime());
				pstmt.setDate(5,filing_time);
				pstmt.setString(6,postjob.getDetail());
				pstmt.setString(7,postjob.getDemand());
				pstmt.setString(8,postjob.getStates());
				pstmt.setInt(9,id);
				count=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return count;
		}

		@Override
		public List<Postjob> selectById() {
			// TODO Auto-generated method stub
			List<Postjob> list=new ArrayList<Postjob>();
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			Postjob pj=null;
			String sql="select p.id,p.personnumber,p.etime,p.filing_time,sio.sname,sip.sname from Postjob p,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip where p.foid=fio.fid and p.soid=sio.id and p.toid=tio.tid and p.fpid=fip.id and p.spid=sip.id and p.states='可修改'";
		    try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()){
					pj=new Postjob(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getString(6));
				    list.add(pj);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return list;
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement pstmt=null;
			int count=0;
			String sql="delete from postjob where id=?";
			try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				count=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}

		@Override
		public Postjob select(int id) {
			// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			Postjob pj=null;
			String sql="select foid,soid,toid,fpid,spid from postjob where id=?";
		    try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				rs=pstmt.executeQuery();
				while(rs.next()){
					pj=new Postjob(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return pj;
		}

		@Override
		public List<Postjob> selectById1() {
			// TODO Auto-generated method stub
			List<Postjob> list=new ArrayList<Postjob>();
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			Postjob pj=null;
			String sql="select p.id,p.personnumber,p.etime,p.filing_time,sio.sname,sip.sname from Postjob p,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip where p.foid=fio.fid and p.soid=sio.id and p.toid=tio.tid and p.fpid=fip.id and p.spid=sip.id and p.states='不可修改'";
		    try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()){
					pj=new Postjob(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getString(6));
				    list.add(pj);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return list;
		}

		@Override
		public Postjob selectById2(int id) {
			// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			Postjob pj=null;
			String sql="select fip.fname,sip.sname from Postjob p,firstorg fio,secondorg sio,thirdorg tio,firstpost fip,secondpost sip where p.foid=fio.fid and p.soid=sio.id and p.toid=tio.tid and p.fpid=fip.id and p.spid=sip.id and p.states='不可修改' and p.id=?";
		    try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				rs=pstmt.executeQuery();
				while(rs.next()){
					pj=new Postjob(rs.getString(1),rs.getString(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return pj;
		}

		@Override
		public int insertResume(Resume resume) {
			// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement pstmt=null;
			int result=0;
			String sql="insert into resume (firstpost,secondpost,posttype,name,gender,email,phone,telephone,mobile,address,postcode,nationality,birthplace,birthday,nation,religion,status,iDcard,age,school,education,years,profession,salary,time,resume,remark) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				conn=DBTool.dataSource.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,resume.getFirstpost());
				pstmt.setString(2,resume.getSecondpost());
				pstmt.setString(3,resume.getPosttype());
				pstmt.setString(4,resume.getName());
				pstmt.setString(5,resume.getGender());
				pstmt.setString(6,resume.getEmail());
				pstmt.setInt(7,resume.getPhone());
				pstmt.setInt(8,resume.getTelephone());
				pstmt.setInt(9,resume.getMobile());
				pstmt.setString(10,resume.getAddress());
				pstmt.setInt(11,resume.getPostcode());
				pstmt.setString(12,resume.getNationality());
				pstmt.setString(13,resume.getBirthplace());
				java.sql.Date birthday= new java.sql.Date(resume.getBirthday().getTime());
				pstmt.setDate(14,birthday);
				pstmt.setString(15,resume.getNation());
				pstmt.setString(16,resume.getReligion());
				pstmt.setString(17,resume.getStatus());
				pstmt.setInt(18,resume.getIDcard());
				pstmt.setInt(19,resume.getAge());
				pstmt.setString(20,resume.getSchool());
				pstmt.setString(21,resume.getEducation());
				pstmt.setString(22,resume.getYears());
				pstmt.setString(23,resume.getProfession());
				pstmt.setString(24,resume.getSalary());
				java.sql.Date time= new java.sql.Date(resume.getTime().getTime());
				pstmt.setDate(25,time);
				pstmt.setString(26,resume.getResume());
				pstmt.setString(27,resume.getRemark());
				result=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}

		@Override
		public List<Resume> selectResume(String firstpost, String secondpost, String keyword, Date stime, Date etime) {
			// TODO Auto-generated method stub
			List<Resume> list=new ArrayList<Resume>();
			Connection conn=null;
			try {
				conn = DBTool.dataSource.getConnection();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			PreparedStatement pstmt =null;
			String sql="select id,firstpost,secondpost,posttype,name,gender from resume where time>? and time<? and firstpost=? and secondpost=? or name like '%" + keyword + "%' or phone like '%" + keyword + "%' or IDcard like '%" + keyword + "%' or resume like '%" + keyword + "%'";
			java.sql.Date stime1=new java.sql.Date(stime.getTime());
			java.sql.Date etime1=new java.sql.Date(etime.getTime());
		    ResultSet rs=null;
		    Resume resume=null;
			try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setDate(1, stime1);
				pstmt.setDate(2, etime1);
				pstmt.setString(3,firstpost);
				pstmt.setString(4,secondpost);
				rs=pstmt.executeQuery();
				while(rs.next()){
					resume=new Resume(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
					list.add(resume);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}

	}

