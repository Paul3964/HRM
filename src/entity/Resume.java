package entity;

import java.util.Date;

public class Resume {
	private int id; 
	private String firstpost;
	private String secondpost;
	private String posttype;
	private String name;
	private String gender;
	private String Email;
	private int phone;
	private int telephone;
	private int mobile;
	private String address;
	private int postcode;
	private String nationality;
	private String birthplace;
	private Date birthday;
	private String nation;
	private String religion;
	private String status;
	private int IDcard;
	private int age;
	private String school;
	private String education;
	private String years;
	private String profession;
	private String salary;
	private Date time;
	private String resume;
	private String remark;
	private int fpid;
	private int spid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstpost() {
		return firstpost;
	}
	public void setFirstpost(String firstpost) {
		this.firstpost = firstpost;
	}
	public String getSecondpost() {
		return secondpost;
	}
	public void setSecondpost(String secondpost) {
		this.secondpost = secondpost;
	}
	public String getPosttype() {
		return posttype;
	}
	public void setPosttype(String posttype) {
		this.posttype = posttype;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
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
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getIDcard() {
		return IDcard;
	}
	public void setIDcard(int iDcard) {
		IDcard = iDcard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	
	
	public Resume(int id, String firstpost, String secondpost, String posttype, String name, String gender) {
		super();
		this.id = id;
		this.firstpost = firstpost;
		this.secondpost = secondpost;
		this.posttype = posttype;
		this.name = name;
		this.gender = gender;
	}
	public Resume(int id, String firstpost, String secondpost, String posttype, String name, String gender,
			String email, int phone, int telephone, int mobile, String address, int postcode, String nationality,
			String birthplace, Date birthday, String nation, String religion, String status, int iDcard, int age,
			String school, String education, String years, String profession, String salary, Date time, String resume,
			String remark, int fpid, int spid) {
		super();
		this.id = id;
		this.firstpost = firstpost;
		this.secondpost = secondpost;
		this.posttype = posttype;
		this.name = name;
		this.gender = gender;
		Email = email;
		this.phone = phone;
		this.telephone = telephone;
		this.mobile = mobile;
		this.address = address;
		this.postcode = postcode;
		this.nationality = nationality;
		this.birthplace = birthplace;
		this.birthday = birthday;
		this.nation = nation;
		this.religion = religion;
		this.status = status;
		IDcard = iDcard;
		this.age = age;
		this.school = school;
		this.education = education;
		this.years = years;
		this.profession = profession;
		this.salary = salary;
		this.time = time;
		this.resume = resume;
		this.remark = remark;
		this.fpid = fpid;
		this.spid = spid;
	}
	public Resume(String firstpost, String secondpost, String posttype, String name, String gender, String email,
			int phone, int telephone, int mobile, String address, int postcode, String nationality, String birthplace,
			Date birthday, String nation, String religion, String status, int iDcard, int age, String school,
			String education, String years, String profession, String salary, Date time, String resume, String remark) {
		super();
		this.firstpost = firstpost;
		this.secondpost = secondpost;
		this.posttype = posttype;
		this.name = name;
		this.gender = gender;
		this.Email = email;
		this.phone = phone;
		this.telephone = telephone;
		this.mobile = mobile;
		this.address = address;
		this.postcode = postcode;
		this.nationality = nationality;
		this.birthplace = birthplace;
		this.birthday = birthday;
		this.nation = nation;
		this.religion = religion;
		this.status = status;
		this.IDcard = iDcard;
		this.age = age;
		this.school = school;
		this.education = education;
		this.years = years;
		this.profession = profession;
		this.salary = salary;
		this.time = time;
		this.resume = resume;
		this.remark = remark;
	}
 
	
}
