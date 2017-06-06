package entity;

public class Staff {
	private int id;
	private String name;
	private String gender;
	private String group;
	private String company;
	private String department;
	private String job;
	private String jobtittle;
	private String states;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int id, String name, String gender, String group, String company, String department, String job,
			String jobtittle) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.group = group;
		this.company = company;
		this.department = department;
		this.job = job;
		this.jobtittle = jobtittle;
	}
	public Staff(int id, String name, String gender, String group, String company, String department, String job,
			String jobtittle,String states) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.group = group;
		this.company = company;
		this.department = department;
		this.job = job;
		this.jobtittle = jobtittle;
		this.states = states;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJobtittle() {
		return jobtittle;
	}
	public void setJobtittle(String jobtittle) {
		this.jobtittle = jobtittle;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	
}
