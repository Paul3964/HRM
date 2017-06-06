package service;

import java.util.Date;
import java.util.List;

import entity.Employee;
import entity.Organization;
import entity.Pager;
import entity.Post;
import entity.Staff;
import entity.orgpost;

public interface IRegisterService {

	public int saveEmployee(Employee employee);

	public Pager SearchEmployeebyCondition(int pageNum, int nums);
    public List<Staff> selectByorg(int fid,int sid,int tid,int fpid,int spid,Date stime,Date etime);
	
	public Employee selectById(int file_number);
	
	public int update(Employee employee);
	public int update1(Employee employee);
	
	public int selectByName1(String firstorg);//获取I级机构ID
	public int selectByName2(String firstorg);//获取II级机构ID
	public int selectByName3(String firstorg);//获取III级机构ID
	public int selectByName4(String titile);//获取I级职位ID
	public int selectByName5(String titile);//获取II级职位ID
	public int selectByName6(String titile);//获取III级职位ID
	public List<Post> selectNameById(String sname);//通过二级职位名获取三级机构
	public orgpost selectOrgPost(int file_number);//通过档案编号查询机构和职位信息

}
