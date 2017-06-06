package service;

import java.util.List;

import entity.Pager;
import entity.Pager1;
import entity.Post;
import entity.PostI;
import entity.PostII;
import entity.Question;
import entity.SeriesTest;
import entity.Test;

public interface ITestService {

	public List<SeriesTest> getAllftest();

	public List<SeriesTest> getAllStest(int id);

	public String getFnameByfid(int id);

	public String getsnameBysid(int id);

	public int getAllTest(Test test);

	public Pager1 SearchtestbyCondition(int pageNum, int nums, Test test);

	public Pager1 SearchexambyCondition(int pageNum, int nums);

	public List<Post> getAllMart();

	public List<PostI> getAllSyn();

	public List<PostII> getAllKnow();

	public int selectQuestionMart(String[] posts, String[] postn, int id);

	public int selectQuestionSyn(String[] postI, String[] postIn, int id);

	public int selectQuestionKnow(String[] postII, String[] postIIn, int id);

	public int SaveQuestion(Question question);

	public List<Test> getAllquestionInfo(int id);

	public List<Question> getAlltestInfo(int id);



}
