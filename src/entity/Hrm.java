package entity;

import java.util.Date;

public class Hrm {
    private Integer id;

    private String firstorg;

    private String secondorg;

    private String thirdorg;

    private String name;

    private Date filingTime;

    private String major;

    private Integer pnum;

    private String phone1;

    private String phone2;

    private String qq;

    private String email;

    public Hrm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hrm(Integer id, String firstorg, String secondorg, String thirdorg,
			String name, Date filingTime, String major, Integer pnum,
			String phone1, String phone2, String qq, String email) {
		super();
		this.id = id;
		this.firstorg = firstorg;
		this.secondorg = secondorg;
		this.thirdorg = thirdorg;
		this.name = name;
		this.filingTime = filingTime;
		this.major = major;
		this.pnum = pnum;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.qq = qq;
		this.email = email;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstorg() {
        return firstorg;
    }

    public void setFirstorg(String firstorg) {
        this.firstorg = firstorg == null ? null : firstorg.trim();
    }

    public String getSecondorg() {
        return secondorg;
    }

    public void setSecondorg(String secondorg) {
        this.secondorg = secondorg == null ? null : secondorg.trim();
    }

    public String getThirdorg() {
        return thirdorg;
    }

    public void setThirdorg(String thirdorg) {
        this.thirdorg = thirdorg == null ? null : thirdorg.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getFilingTime() {
        return filingTime;
    }

    public void setFilingTime(Date filingTime) {
        this.filingTime = filingTime;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}