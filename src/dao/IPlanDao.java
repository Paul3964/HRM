package dao;

import java.util.List;

import entity.plan;

public interface IPlanDao {
	public int getTotalCount();
	public List<plan> getAllout(int pageNum,int nums);

}
