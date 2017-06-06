package service.impl;

import java.util.List;

import dao.ISalaryDao;
import dao.impl.SalaryDaoImpl;
import entity.Pager;
import entity.Salary;
import service.ISalaryService;

public class SalaryServiceImpl implements ISalaryService {
private static ISalaryDao is = new SalaryDaoImpl();
	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return is.getId();
	}


	@Override
	public int saveSalary(Salary s) {
		
		return is.saveSaveSalary(s);
	}


	@Override
	public Pager getAllsalary(int pagNum,int nums) {
		// TODO Auto-generated method stub
		int totalCount = is.getTotalCount();//获取所有的条数
		double ns = nums;
		int totalPage = (int) Math.ceil(totalCount/ns);//判断出页数
		Pager pager = new Pager();
		pager.setCurrentPage(pagNum);
		pager.setNums(nums);
		pager.setTotalCount(totalCount);
		pager.setTotalPage(totalPage);
		pager.setSalary(is.getAllstates(pagNum, nums));
		return pager;
	}


	@Override
	public List<Salary> getAllSalary(int id) {
		
		return is.showSalary(id);
	}


	@Override
	public int checkSalary(int id) {
		
		return is.updateSalary(id);
	}


	@Override
	public int insertSalary(int id,String message) {
		// TODO Auto-generated method stub
		return is.insertSalary(id,message);
	}


	@Override
	public Pager search(int pagNum, int nums, Salary s) {
		Pager pager = new Pager();
		int totalCount =is.getCount(s);
		double ns = nums;
		int totalPage = (int) Math.ceil(totalCount/ns);
		pager.setCurrentPage(pagNum);
		pager.setNums(nums);
		pager.setSalary(is.getSalary(pagNum, nums, s));
		pager.setTotalCount(totalCount);
		pager.setTotalPage(totalPage);
		return pager;
	}
}
