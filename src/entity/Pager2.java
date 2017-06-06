package entity;

import java.util.List;



public class Pager2 {
	private int totalCount;//数据总条数
	private int totalPage;//总页数
	private int currentPage;//当前页数
	private int nums;//每页多少条
	private List<plan> pl;
	
	public List<plan> getPl() {
		return pl;
	}
	public void setPl(List<plan> pl) {
		this.pl = pl;
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

	public Pager2(int totalCount, int totalPage, int currentPage, int nums, List<plan> pl) {
		super();
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.nums = nums;
		this.pl = pl;
	}
	public Pager2() {
		super();
	}

}
