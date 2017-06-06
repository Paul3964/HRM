package entity;

public class Organization {
	private int fid;
	private String firstorg;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFirstorg() {
		return firstorg;
	}
	public void setFirstorg(String firstorg) {
		this.firstorg = firstorg;
	}	
	public Organization(int fid, String firstorg) {
		super();
		this.fid = fid;
		this.firstorg = firstorg;
	}
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
