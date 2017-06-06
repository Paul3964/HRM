package service;

import entity.Pager;

public interface IdeleteService {
public abstract int updateStates(int eid);//根据id修改审核状态
public abstract Pager serach(int pageNum,int nums);
public int updatestate(int eid);
}
