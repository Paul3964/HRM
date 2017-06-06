package entity;

import java.util.Date;
public class Employee {
	private int eid;
	private String name;
	private String gender;
	public Employee(int eid, String name, String gender, String phone, String registrant, String nationality,
			String states) {
		super();
		this.eid = eid;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.registrant = registrant;
		this.nationality = nationality;
		this.states = states;
	}
	private String Email;
	private String phone;
	private String QQ;
	private String mobile;
	private String address;
	private String registrant;
	private String postcode;
	private String nationality;
	private String birthplace;
	private Date birthday;
	private String nation;
	private String resume;
	private String family;
	private String salary_standard;
	private Date filing_time;
	private String account;
	private String notes;
	private int foid; 
	private int soid;
	private int toid; 
	private int fpid;
	private int spid; 
	private int tpid;
	private String states;
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public Employee(int eid, String name, String gender, String email,
			String phone, String qQ, String mobile, String address,
			String registrant, String postcode, String nationality,
			String birthplace, Date birthday, String nation, String resume,
			String family, String salary_standard, Date filing_time,
			String account, String notes, int foid, int soid, int toid,
			int fpid, int spid, int tpid) {
		super();
		this.eid = eid;
		this.name = name;
		this.gender = gender;
		Email = email;
		this.phone = phone;
		QQ = qQ;
		this.mobile = mobile;
		this.address = address;
		this.registrant = registrant;
		this.postcode = postcode;
		this.nationality = nationality;
		this.birthplace = birthplace;
		this.birthday = birthday;
		this.nation = nation;
		this.resume = resume;
		this.family = family;
		this.salary_standard = salary_standard;
		this.filing_time = filing_time;
		this.account = account;
		this.notes = notes;
		this.foid = foid;
		this.soid = soid;
		this.toid = toid;
		this.fpid = fpid;
		this.spid = spid;
		this.tpid = tpid;
	}
	public Employee(int eid, String name, String gender, String email, String phone, String qQ, String mobile,
			String address, String registrant, String postcode, String nationality, String birthplace, Date birthday,
			String nation, String resume, String family, String salary_standard, Date filing_time, String account,
			String notes, int tpid) {
		super();
		this.eid = eid;
		this.name = name;
		this.gender = gender;
		Email = email;
		this.phone = phone;
		QQ = qQ;
		this.mobile = mobile;
		this.address = address;
		this.registrant = registrant;
		this.postcode = postcode;
		this.nationality = nationality;
		this.birthplace = birthplace;
		this.birthday = birthday;
		this.nation = nation;
		this.resume = resume;
		this.family = family;
		this.salary_standard = salary_standard;
		this.filing_time = filing_time;
		this.account = account;
		this.notes = notes;
		this.tpid = tpid;
	}
	public Employee(int eid, String name, String gender, String email, String phone, String qQ, String mobile,
			String address, String registrant, String postcode, String nationality, String birthplace, Date birthday,
			String nation, String resume, String family, String salary_standard, Date filing_time, String account,
			String notes) {
		super();
		this.eid = eid;
		this.name = name;
		this.gender = gender;
		Email = email;
		this.phone = phone;
		QQ = qQ;
		this.mobile = mobile;
		this.address = address;
		this.registrant = registrant;
		this.postcode = postcode;
		this.nationality = nationality;
		this.birthplace = birthplace;
		this.birthday = birthday;
		this.nation = nation;
		this.resume = resume;
		this.family = family;
		this.salary_standard = salary_standard;
		this.filing_time = filing_time;
		this.account = account;
		this.notes = notes;
	}

	public Employee(int eid, String name, String gender) {
		super();
		this.eid = eid;
		this.name = name;
		this.gender = gender;
	}
	public Employee(int eid,String name,int foid, int soid, int toid,
			int fpid, int spid){		
		this.name=name;
		this.foid = foid;
		this.soid = soid;
		this.toid = toid;
		this.fpid = fpid;
		this.spid = spid;
		this.eid=eid;	
	}
	public int getFoid() {
		return foid;
	}
	public void setFoid(int foid) {
		this.foid = foid;
	}
	public int getSoid() {
		return soid;
	}
	public void setSoid(int soid) {
		this.soid = soid;
	}
	public int getToid() {
		return toid;
	}
	public void setToid(int toid) {
		this.toid = toid;
	}
	public int getFpid() {
		return fpid;
	}
	public void setFpid(int fpid) {
		this.fpid = fpid;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public int getTpid() {
		return tpid;
	}
	public void setTpid(int tpid) {
		this.tpid = tpid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegistrant() {
		return registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getSalary_standard() {
		return salary_standard;
	}
	public void setSalary_standard(String salary_standard) {
		this.salary_standard = salary_standard;
	}
	public Date getFiling_time() {
		return filing_time;
	}
	public void setFiling_time(Date filing_time) {
		this.filing_time = filing_time;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
