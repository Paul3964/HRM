package service.impl;

import java.util.Date;
import java.util.List;

import dao.IPostDao;
import dao.impl.PostDaoImpl;
import entity.Postjob;
import entity.Resume;
import service.IPostService;

public class PostServiceImpl implements IPostService {
    private IPostDao postDao=new PostDaoImpl();
	@Override
	public int insertPost(Postjob postjob) {
		// TODO Auto-generated method stub
		return postDao.insertPost(postjob);
	}
	@Override
	public Postjob selectById(int id,int foid, int soid, int toid, int fpid, int spid) {
		// TODO Auto-generated method stub
		return postDao.selectById(id,foid, soid, toid, fpid, spid);
	}
	@Override
	public List<Postjob> selectById() {
		// TODO Auto-generated method stub
		return postDao.selectById();
	}
	@Override
	public int Update(int id, Postjob postjob) {
		// TODO Auto-generated method stub
		return postDao.Update(id, postjob);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return postDao.delete(id);
	}
	@Override
	public Postjob select(int id) {
		// TODO Auto-generated method stub
		return postDao.select(id);
	}
	@Override
	public List<Postjob> selectById1() {
		// TODO Auto-generated method stub
		return postDao.selectById1();
	}
	@Override
	public Postjob selectById2(int id) {
		// TODO Auto-generated method stub
		return postDao.selectById2(id);
	}
	@Override
	public int insertResume(Resume resume) {
		// TODO Auto-generated method stub
		return postDao.insertResume(resume);
	}
	@Override
	public List<Resume> selectResume(String firstpost, String secondpost, String keyword, Date stime, Date etime) {
		// TODO Auto-generated method stub
		return postDao.selectResume(firstpost, secondpost, keyword, stime, etime);
	}

}

