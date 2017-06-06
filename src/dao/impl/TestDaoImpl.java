package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.StringHolder;

import tool.DBTool;
import dao.IRegisterDao;
import dao.ITestDao;
import entity.Employee;
import entity.Organization;
import entity.Pager;
import entity.Post;
import entity.PostI;
import entity.PostII;
import entity.Question;
import entity.SeriesTest;
import entity.Test;

public class TestDaoImpl implements ITestDao {
	IRegisterDao registerDao = new RegisterDaoImpl();
	@Override
	public List<SeriesTest> getAllftest() {
		// TODO Auto-generated method stub
		List<SeriesTest> list = new ArrayList<>();
		String sql = "select *from ftest";
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
				SeriesTest	seriesTest = new SeriesTest(rs.getInt(1), rs.getString(2));
				list.add(seriesTest);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
		}
		return list;
	}

	@Override
	public List<SeriesTest> getAllStest(int id) {
		// TODO Auto-generated method stub
		List<SeriesTest> list = new ArrayList<>();
		String sql = "select *from stest where sid in (select sid from fs where fid = ?)";
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
				SeriesTest	seriesTest = new SeriesTest(rs.getInt(1), rs.getString(2));
				list.add(seriesTest);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public String getFnameByfid(int id) {
		// TODO Auto-generated method stub
		String fname = null;
		String sql = "select fname from ftest where fid=?";
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
				fname = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
		}
		
		return fname;
	}

	@Override
	public String getsnameBysid(int id) {
		// TODO Auto-generated method stub
		String sname = null;
		String sql = "select sname from stest where sid=?";
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
				sname = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
		}
		
		return sname;
	}

	@Override
	public int getAllTest(Test test) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "insert into test (id,question,a,b,c,"
				+ "d,e,resume,answer,filing_time,"
				+ "source,fname,sname) values (?,?,?,?,?,"
				+ "?,?,?,?,?,"
				+ "?,?,?)";
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
			pstmt.setInt(1, test.getId());
			pstmt.setString(2, test.getQuestion());
			pstmt.setString(3, test.getA());
			pstmt.setString(4, test.getB());
			pstmt.setString(5, test.getC());
			pstmt.setString(6, test.getD());
			pstmt.setString(7, test.getE());
			pstmt.setString(8, test.getResume());
			pstmt.setString(9, test.getAnswer());
//			java.sql.Date date= new java.sql.Date(test.getFiling_time().getTime());
			pstmt.setString(10, test.getFiling_time());
			pstmt.setString(11, test.getSource());
			pstmt.setString(12, test.getFname());
			pstmt.setString(13, test.getSname());
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
	public int getTotalCount(Test test) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from test where 1=1 and fname ='"+test.getFname()+"'";
//		if(test.getId()!=-1){
//			sql+=" and id =" + test.getId();
//		}

		
		if(test.getA()!=null&&"".equals(test.getA()))
		{
			sql+=" and question like'%"+test.getA()+"%'"+" or resume like'%"+test.getA()+"%'"+" or source like'%"+test.getA()+"%'";
		}
		

		if(test.getFiling_time()!=null&&"".equals(test.getFiling_time())&&test.getFiling_time2()!=null&&"".equals(test.getFiling_time2()))
		{
			sql+=" and filing_time between '"+test.getFiling_time()+"' and '"+test.getFiling_time2()+"'";
		}
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
	public List<Test> getList(int pageNum, int nums, Test test) {
		// TODO Auto-generated method stub
		List<Test> tests = new ArrayList<>();
		String sql = "select id,question,a,resume,filing_time,source,fname,sname,answer from test where 1=1 and fname ='"+test.getFname()+"'";
//		if(test.getId()!=-1){
//			sql+=" and id =" + test.getId();
//		}

		if(test.getA()!=null&&"".equals(test.getA()))
		{
			sql+=" and question like'%"+test.getA()+"%'"+" or resume like'%"+test.getA()+"%'"+" or source like'%"+test.getA()+"%'";
		}
		

		if(test.getFiling_time()!=null&&"".equals(test.getFiling_time())&&test.getFiling_time2()!=null&&"".equals(test.getFiling_time2()))
		{
			sql+=" and filing_time between '"+test.getFiling_time()+"' and '"+test.getFiling_time2()+"'";
		}
		
		sql+=" limit ?,?";
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
				 Test t = new Test(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), null);
				 tests.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return tests;
	}

	@Override
	public int getSecondCount() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from secondpost";
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
	public int getThirdCount() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from thirdpost";
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
		
		return count;	}


	@Override
	public List<Test> getExam(int pageNum, int nums) {
		// TODO Auto-generated method stub
		List<Test> tests = new ArrayList<>();
		String sql = "select secondpost.id,thirdpost.tid,sname,tname from secondpost,thirdpost where secondpost.id = thirdpost.tid limit ?,?";
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
				Test test = new Test(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4));
				tests.add(test);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return tests;
	}

	@Override
	public List<PostI> getAllSyn() {
		// TODO Auto-generated method stub
		List<PostI> postIs = new ArrayList<>();
		String sql = "select count(*),sname from test where fname='理科' group by sname";
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
				PostI postI = new PostI(rs.getInt(1), rs.getString(2));
				postIs.add(postI);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return postIs;
	}

	@Override
	public List<Post> getAllMart() {
		// TODO Auto-generated method stub
		List<Post> post = new ArrayList<>();
		String sql = "select count(*),sname from test where fname='文科' group by sname";
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
				Post postI = new Post(rs.getInt(1), rs.getString(2));
				post.add(postI);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return post;
	}

	@Override
	public List<PostII> getAllKnow() {
		// TODO Auto-generated method stub
		List<PostII> postII = new ArrayList<>();
		String sql = "select count(*),sname from test where fname='专业知识类'  group by sname";
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
				PostII postI = new PostII(rs.getInt(1), rs.getString(2));
				postII.add(postI);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return postII;
	}

	@Override
	public int selectQuestionMart(int tid,int id) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "insert into qt (bid,tid) values (?,?)";
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
			pstmt.setInt(1,id);
			pstmt.setInt(2, tid);

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
	public int selectQuestionSyn(int tid, int id) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "insert into qt (bid,tid) values (?,?)";
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
			pstmt.setInt(1,id);
			pstmt.setInt(2,tid);

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
	public int selectQuestionKnow(int tid, int id) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "insert into qt (bid,tid) values (?,?)";
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
			pstmt.setInt(1,id);
			pstmt.setInt(2,tid);

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
	public int SaveQuestion(Question question) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "insert into questbank (bid,fpost,spost,resigner,time,atime) values (?,?,?,?,?,?)";
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
			pstmt.setInt(1,question.getId());
			pstmt.setString(2, question.getFpost());
			pstmt.setString(3, question.getSpost());
			pstmt.setString(4, question.getResigner());
			pstmt.setString(5, question.getTime());
			pstmt.setInt(6, question.getAtime());
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
	public List<Post> selectQuestionId(String string) {
		// TODO Auto-generated method stub
		List<Post> post= new ArrayList<>();
		String sql = "select id from test where sname = '"+string+"'"+"and fname = '文科'";
//		System.out.println("文科"+string);
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
				Post postI = new Post(rs.getInt(1));
				post.add(postI);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return post;
	}

	@Override
	public List<Post> selectQuestionId1(String string) {
		// TODO Auto-generated method stub
		List<Post> post= new ArrayList<>();
		String sql = "select id from test where sname = '"+string+"'"+"and fname = '理科'";
//		System.out.println("理科"+string);
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
				Post postI = new Post(rs.getInt(1));
				post.add(postI);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return post;
	}

	@Override
	public List<Post> selectQuestionId2(String string) {
		// TODO Auto-generated method stub
		List<Post> post= new ArrayList<>();
		String sql = "select id from test where sname = '"+string+"'"+"and fname = '专业知识类'";
//		System.out.println("专业知识类"+string);
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
				Post postI = new Post(rs.getInt(1));
				post.add(postI);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return post;
	}

	@Override
	public List<Test> getAllquestionInfo(int id) {
		// TODO Auto-generated method stub
		List<Test> tests = new ArrayList<>();
		String sql = "select question,a,b,c,d,e from test where id in (select tid from qt where bid =  "+id+")";
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
				Test test1 = new Test(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6));
				tests.add(test1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return tests;
	}

	@Override
	public List<Question> getAlltestInfo(int id) {
		// TODO Auto-generated method stub
		List<Question> questions = new ArrayList<>();
		String sql = "select * from questbank where bid = "+id;
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
				Question question1 = new Question(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
				questions.add(question1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, rs);
			}
		
		return questions;
	}

	@Override
	public int getTidSame(int id, int id2) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "select id from qt where bid=? and tid=?";
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
			pstmt.setInt(1,id);
			pstmt.setInt(2,id2);

			result=pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBTool.closeConnection(conn, pstmt, null);
		}
		if(result==1)
			return 0;
		else 
			return 1;
	}



	
	


	
}
