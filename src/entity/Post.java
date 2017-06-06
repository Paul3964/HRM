package entity;

public class Post {
	private int id;
	private String titile;
	public int getId() {
		return id;
	}
	
	public Post(int id) {
		super();
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Post(String titile) {
		super();
		this.titile = titile;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int id, String titile) {
		super();
		this.id = id;
		this.titile = titile;
	}

	
}
