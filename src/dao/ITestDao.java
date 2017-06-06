package dao;

import java.util.List;

import entity.Employee;
import entity.Pager;
import entity.Post;
import entity.PostI;
import entity.PostII;
import entity.Question;
import entity.SeriesTest;
import entity.Test;

public interface ITestDao {

	public List<SeriesTest> getAllftest();

	public List<SeriesTest> getAllStest(int id);

	public String getFnameByfid(int id);

	public String getsnameBysid(int id);

	public int getAllTest(Test test);




	public List<Test> getList(int pageNum, int nums, Test test);

	public int getTotalCount(Test test);

//	public int getTotalCount();

	public List<Test> getExam(int pageNum, int nums);

	public int getThirdCount();

	public int getSecondCount();

	public List<PostI> getAllSyn();

	public List<Post> getAllMart();

	public List<PostII> getAllKnow();

	public int selectQuestionMart(int tid, int id);

	public int selectQuestionSyn(int tid,int id);

	public int selectQuestionKnow(int tid,int id);

	public int SaveQuestion(Question question);

	public List<Post> selectQuestionId(String string);

	public List<Post> selectQuestionId1(String string);

	public List<Post> selectQuestionId2(String string);

	public List<Test> getAllquestionInfo(int id);

	public List<Question> getAlltestInfo(int id);

	public int getTidSame(int id, int id2);

}
