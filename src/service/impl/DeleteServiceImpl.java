package service.impl;

import dao.IdeleteDao;
import dao.impl.DeleteDaoImpl;
import entity.Pager;
import service.IdeleteService;

public class DeleteServiceImpl implements IdeleteService {
private IdeleteDao id = new DeleteDaoImpl();
	@Override
	public int updateStates(int eid) {
		
		return id.updateStates(eid);
	}
	@Override
	public Pager serach(int pageNum, int nums) {
		//获取记录数
		int totalCount  = id.getAllCount();
		double ns = nums;
		int totalPage = (int) Math.ceil(totalCount/ns);
		Pager p =new Pager();
		p.setCurrentPage(pageNum);
		p.setNums(nums);
		p.setTotalCount(totalCount);
		p.setTotalPage(totalPage);
		p.setStaff(id.getAllEmployee(pageNum, nums));
		return p;
	}
	@Override
	public int updatestate(int eid) {
		
		return id.updatestate(eid);
	}

}
