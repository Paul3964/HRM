package entity;

public class PostII {
	private int num;
	private String name;
	public int getNum() {
		return num;
	}
	public PostII(String name) {
		super();
		this.name = name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PostII(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public PostII() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
