package entity;

import java.util.Date;

public class Question {
	private int id;
	private String fpost;
	private String spost;
	private String resigner;
	private String time;
	private int atime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFpost() {
		return fpost;
	}
	public void setFpost(String fpost) {
		this.fpost = fpost;
	}
	public String getSpost() {
		return spost;
	}
	public void setSpost(String spost) {
		this.spost = spost;
	}
	public String getResigner() {
		return resigner;
	}
	public void setResigner(String resigner) {
		this.resigner = resigner;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getAtime() {
		return atime;
	}
	public void setAtime(int atime) {
		this.atime = atime;
	}
	public Question(int id, String fpost, String spost, String resigner,
			String time, int atime) {
		super();
		this.id = id;
		this.fpost = fpost;
		this.spost = spost;
		this.resigner = resigner;
		this.time = time;
		this.atime = atime;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
