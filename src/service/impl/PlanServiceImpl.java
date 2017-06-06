package service.impl;

import dao.IPlanDao;
import dao.impl.PlanDaoImpl;
import entity.Pager2;
import service.IPlanService;

public class PlanServiceImpl implements IPlanService {
	private IPlanDao planDao=new PlanDaoImpl();
	@Override
	public Pager2 getAllout(int pageNum, int nums) {
		// TODO Auto-generated method stub
		Pager2 pager=new Pager2();
		int totalCount = planDao.getTotalCount();
		double ns = nums;
		int totalPage =  (int) Math.ceil(totalCount/ns);
		pager.setTotalCount(totalCount);
		pager.setTotalPage(totalPage);
		pager.setCurrentPage(pageNum);
		pager.setNums(nums);
		// 1  0,10    2  10,10   3 20,10
		//limit  (pageNum-1)*nums,nums
		
		pager.setPl(planDao.getAllout(pageNum, nums));
		return pager;
	}

}
