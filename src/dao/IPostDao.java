	package dao;

	import java.util.Date;
	import java.util.List;

	import entity.Postjob;
	import entity.Resume;
	import entity.orgpost;

	public interface IPostDao {
		public int insertPost(Postjob postjob);//添加职位招聘信息
		public Postjob select(int id);
		public Postjob selectById(int id,int foid,int soid,int toid,int fpid,int spid);
		public List<Postjob> selectById();
		public int Update(int id,Postjob postjob);//修改职位招聘信息
		public int delete(int id);//根据ID删除职位招聘信息
		public List<Postjob> selectById1();
	    public Postjob selectById2(int id);//通过ID查找一级机构和二级机构名
	    public int insertResume(Resume resume);//添加简历信息
	    public List<Resume> selectResume(String firstpost,String secondpost,String keyword,Date stime,Date etime);
	}



