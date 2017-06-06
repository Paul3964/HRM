package entity;

public class PostI {
	private int num;
	private String name;
	public int getNum() {
		return num;
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
	public PostI(String name) {
		super();
		this.name = name;
	}
	public PostI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostI(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
}
