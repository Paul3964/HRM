package dao;

import java.util.List;

import entity.Staff;

public interface IdeleteDao {
//根据id修改状态
public abstract int updateStates(int eid);
//获取数据条数
public abstract int getAllCount();
//根据页数和数据条数分页
public abstract List<Staff> getAllEmployee(int pageNum,int nums);
//根据id修改状态为复核
public abstract int updatestate(int eid);
}
