package service.impl;

import java.util.List;

import dao.IQueryDao;
import dao.impl.QueryDaoImpl;
import entity.Staff;
import service.IQueryService;

public class QueryServiceImpl implements IQueryService {
private IQueryDao q=new QueryDaoImpl();
	@Override
	public List<Staff> query(int id) {		
		return q.getEmplyee(id);
	}

}
