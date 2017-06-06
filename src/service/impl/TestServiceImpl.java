package service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import dao.ITestDao;
import dao.impl.TestDaoImpl;
import entity.Pager;
import entity.Pager1;
import entity.Post;
import entity.PostI;
import entity.PostII;
import entity.Question;
import entity.SeriesTest;
import entity.Test;
import service.ITestService;

public class TestServiceImpl implements ITestService {
	ITestDao testDao = new TestDaoImpl();
	@Override
	public List<SeriesTest> getAllftest() {
		// TODO Auto-generated method stub
		return testDao.getAllftest();
	}
	
	@Override
	public List<SeriesTest> getAllStest(int id) {
		// TODO Auto-generated method stub
		return testDao.getAllStest(id);
	}

	@Override
	public String getFnameByfid(int id) {
		// TODO Auto-generated method stub
		return testDao.getFnameByfid(id);
	}

	@Override
	public String getsnameBysid(int id) {
		// TODO Auto-generated method stub
		return testDao.getsnameBysid(id);
	}

	@Override
	public int getAllTest(Test test) {
		// TODO Auto-generated method stub
		return testDao.getAllTest(test);
	}

	@Override
	public Pager1 SearchtestbyCondition(int pageNum, int nums,Test test) {
		// TODO Auto-generated method stub
		Pager1 pager = new Pager1();
		int totalCount =  testDao.getTotalCount(test);
//		System.out.println("总个数："+totalCount);
		double ns = nums;
		int totalPage = (int) Math.ceil(totalCount/ns);
//		System.out.println("总页数："+totalPage);
		pager.setTotalCount(totalCount);
		pager.setTotalPage(totalPage);
		pager.setCurrentPage(pageNum);
		pager.setNums(nums);
		pager.setTest(testDao.getList(pageNum,nums,test));
//		System.out.println(testDao.getList(pageNum,nums,test));
		return pager;
	}

	@Override
	public Pager1 SearchexambyCondition(int pageNum, int nums) {
		// TODO Auto-generated method stub
		Pager1 pager = new Pager1();
		int totalCount =  testDao.getThirdCount();
//		System.out.println("总个数："+totalCount);
		double ns = nums;
		int totalPage = (int) Math.ceil(totalCount/ns);
//		System.out.println("总页数："+totalPage);
		pager.setTotalCount(totalCount);
		pager.setTotalPage(totalPage);
		pager.setCurrentPage(pageNum);
		pager.setNums(nums);
		pager.setTest(testDao.getExam(pageNum,nums));
//		System.out.println(testDao.getExam(pageNum,nums));
		return pager;
	}

	@Override
	public List<Post> getAllMart() {
		// TODO Auto-generated method stub
		return testDao.getAllMart();
	}

	@Override
	public List<PostI> getAllSyn() {
		// TODO Auto-generated method stub
		return testDao.getAllSyn();
	}

	@Override
	public List<PostII> getAllKnow() {
		// TODO Auto-generated method stub
		return testDao.getAllKnow();
	}

	@Override
	public int selectQuestionMart(String[] posts, String[] postn ,int id) {
		// TODO Auto-generated method stub
		List<Post> p = new ArrayList<>();
		int result = 0;
		int i;
		for(i = 0;i<posts.length;i++){
			p= testDao.selectQuestionId(posts[i]);
			for (int j = 0; j <Integer.parseInt(postn[i]) ; j++) {
				for(int k=0;k<=p.size();k++){
				int tid = (int)(Math.random()*p.size()+1);
//				int tid = 1;
//				System.out.println("题号："+tid);
				Post post = p.get(tid);
				testDao.selectQuestionMart(post.getId(),id);}
			}
			
			
		}
		if(i == posts.length){
			result = 1;
		}
		return result;
	}

	@Override
	public int selectQuestionSyn(String[] postI, String[] postIn ,int id ) {
		// TODO Auto-generated method stub
		List<Post> p = new ArrayList<>();
		int result = 0;
		int i;
		for(i = 0;i<postI.length;i++){
			
			p= testDao.selectQuestionId1(postI[i]);
			for (int j = 0; j <Integer.parseInt(postIn[i]) ; j++) {
				for(int k=0;k<=p.size();k++){
				int tid = (int)(Math.random()*p.size()+1);
//				System.out.println("题号："+tid);
//				int tid = 2;
				Post post = p.get(tid);
				testDao.selectQuestionMart(post.getId(),id);}
				
			}
			
			
		}
		if(i == postI.length){
			result = 1;
		}
		return result;
	}

	@Override
	public int selectQuestionKnow(String[] postII, String[] postIIn,int id) {
		// TODO Auto-generated method stub
		List<Post> p = new ArrayList<>();
		int result = 0;
		int i;
		for(i = 0;i<postII.length;i++){
			
			p= testDao.selectQuestionId2(postII[i]);
			for (int j = 0; j <Integer.parseInt(postIIn[i]) ; j++) {
				for(int k=0;k<=p.size();k++){
				int tid = (int)(Math.random()*p.size()+1);
//				System.out.println("题号："+tid);
//				int tid = 3;
				Post post = p.get(tid);
				testDao.selectQuestionMart(post.getId(),id);
				
				}
				
			}
		}
		if(i == postII.length){
			result = 1;
		}
		return result;
	}

	@Override
	public int SaveQuestion(Question question) {
		// TODO Auto-generated method stub
		return testDao.SaveQuestion(question);
	}

	@Override
	public List<Test> getAllquestionInfo(int id) {
		// TODO Auto-generated method stub
		return testDao.getAllquestionInfo(id);
	}

	@Override
	public List<Question> getAlltestInfo(int id) {
		// TODO Auto-generated method stub
		return testDao.getAlltestInfo(id);
	}

}
