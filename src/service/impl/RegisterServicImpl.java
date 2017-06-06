package service.impl;

import java.util.Date;
import java.util.List;

import dao.IRegisterDao;
import dao.impl.RegisterDaoImpl;
import entity.Employee;
import entity.Organization;
import entity.Pager;
import entity.Post;
import entity.Staff;
import entity.orgpost;
import service.IRegisterService;

public class RegisterServicImpl implements IRegisterService {
	IRegisterDao registerDao = new RegisterDaoImpl();

	@Override
	public int saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return registerDao.saveEmployee(employee);
	}

	@Override
	public Pager SearchEmployeebyCondition(int pageNum, int nums) {
		// TODO Auto-generated method stub
		Pager pager = new Pager();
		int totalCount =  registerDao.getTotalCount();
//		System.out.println("总个数："+registerDao.getTotalCount());
		double ns = nums;
//		System.out.println(ns);
		int totalPage = (int) Math.ceil(totalCount/ns);
//		System.out.println("总页数："+totalPage);
		pager.setTotalCount(totalCount);
		pager.setTotalPage(totalPage);
		pager.setCurrentPage(pageNum);
		pager.setNums(nums);
		pager.setEmployees(registerDao.getEmplyee(pageNum,nums));
//		System.out.println(registerDao.getEmplyee(pageNum,nums));
		return pager;
	}

	@Override
	public List<Staff> selectByorg(int fid, int sid, int tid, int fpid, int spid, Date stime, Date etime) {
		// TODO Auto-generated method stub
		return registerDao.selectByorg(fid, sid, tid, fpid, spid, stime, etime);
	}

	@Override
	public Employee selectById(int file_number) {
		// TODO Auto-generated method stub
		return registerDao.selectById(file_number);
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return registerDao.update(employee);
	}

	@Override
	public int selectByName1(String firstorg) {
		// TODO Auto-generated method stub
		return registerDao.selectByName1(firstorg);
	}

	@Override
	public int selectByName2(String firstorg) {
		// TODO Auto-generated method stub
		return registerDao.selectByName2(firstorg);
	}

	@Override
	public int selectByName3(String firstorg) {
		// TODO Auto-generated method stub
		return registerDao.selectByName3(firstorg);
	}

	@Override
	public int selectByName4(String titile) {
		// TODO Auto-generated method stub
		return registerDao.selectByName4(titile);
	}

	@Override
	public int selectByName5(String titile) {
		// TODO Auto-generated method stub
		return registerDao.selectByName5(titile);
	}

	@Override
	public int selectByName6(String titile) {
		// TODO Auto-generated method stub
		return registerDao.selectByName6(titile);
	}

	@Override
	public List<Post> selectNameById(String sname) {
		// TODO Auto-generated method stub
		return registerDao.selectNameById(sname);
	}

	@Override
	public orgpost selectOrgPost(int file_number) {
		// TODO Auto-generated method stub
		return registerDao.selectOrgPost(file_number);
	}

	@Override
	public int update1(Employee employee) {	
		return registerDao.update1(employee);
	}

}
