package entity;

import java.util.List;

public class Pager {
	private int totalCount;
	private int totalPage;
	private int currentPage;
	private int nums;
	private List<Employee> employees;
	private List<Staff> staff;
	private List<Salary> salary;
	
	public Pager(int totalCount, int totalPage, int currentPage, int nums, List<Employee> employees, List<Staff> staff,
			List<Salary> salary) {
		super();
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.nums = nums;
		this.employees = employees;
		this.staff = staff;
		this.salary = salary;
	}
	public List<Salary> getSalary() {
		return salary;
	}
	public void setSalary(List<Salary> salary) {
		this.salary = salary;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pager(int totalCount, int totalPage, int currentPage, int nums,
			List<Employee> employees) {
		super();
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.nums = nums;
		this.employees = employees;
	}
	public Pager(int totalCount, int totalPage, int currentPage, int nums, List<Employee> employees,
			List<Staff> staff) {
		super();
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.nums = nums;
		this.employees = employees;
		this.staff = staff;
	}
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	
	
}
