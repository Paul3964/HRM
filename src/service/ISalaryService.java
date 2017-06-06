package service;

import java.util.List;

import dao.ISalaryDao;
import dao.impl.SalaryDaoImpl;
import entity.Pager;
import entity.Salary;

public interface ISalaryService {
	//获取显示在页面上的number
	public abstract String getNumber();
	public abstract int saveSalary(Salary s);
	//显示待复核薪酬标准
	public abstract Pager getAllsalary(int pagNum,int nums);
	//根据id进入待审核界面
	public abstract List<Salary> getAllSalary(int id);
	//根据id审核
	public abstract int checkSalary(int id);
	//根据id插入审核意见
	public abstract int insertSalary(int id,String message);
	
	public abstract Pager search(int pagNum,int nums,Salary s);
}
