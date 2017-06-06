package entity;

import java.util.Date;

public class Postjob {
	private int id;
	private int foid;
	private int soid;
	private int toid;
	private String posttype;
	private int fpid;
	private int spid;
	private int personnumber;
	private Date etime;
	private String register;
	private Date filing_time;
	private String detail;
	private String demand;
	private String states;
	private String firstorg;
	private String secondorg;
	private String thirdorg;
	private String firstpost;
	private String secondpost;
	
	
	public String getFirstorg() {
		return firstorg;
	}


	public void setFirstorg(String firstorg) {
		this.firstorg = firstorg;
	}


	public String getSecondorg() {
		return secondorg;
	}


	public void setSecondorg(String secondorg) {
		this.secondorg = secondorg;
	}


	public String getThirdorg() {
		return thirdorg;
	}


	public void setThirdorg(String thirdorg) {
		this.thirdorg = thirdorg;
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

    
	public Postjob(String firstpost, String secondpost) {
		super();
		this.firstpost = firstpost;
		this.secondpost = secondpost;
	}


	public Postjob(int personnumber, Date etime, Date filing_time, String secondorg, String secondpost) {
		super();
		this.personnumber = personnumber;
		this.etime = etime;
		this.filing_time = filing_time;
		this.secondorg = secondorg;
		this.secondpost = secondpost;
	}
	public Postjob(int id,int personnumber, Date etime, Date filing_time, String secondorg, String secondpost) {
		super();
		this.id=id;
		this.personnumber = personnumber;
		this.etime = etime;
		this.filing_time = filing_time;
		this.secondorg = secondorg;
		this.secondpost = secondpost;
	}


	public Postjob(String firstorg, String secondorg, String thirdorg, String firstpost, String secondpost) {
		super();
		this.firstorg = firstorg;
		this.secondorg = secondorg;
		this.thirdorg = thirdorg;
		this.firstpost = firstpost;
		this.secondpost = secondpost;
	}


	public Postjob(int foid, int soid, int toid, String posttype, int fpid, int spid, int personnumber, Date etime,
			String register, Date filing_time, String detail, String demand, String states) {
		super();
		this.foid = foid;
		this.soid = soid;
		this.toid = toid;
		this.posttype = posttype;
		this.fpid = fpid;
		this.spid = spid;
		this.personnumber = personnumber;
		this.etime = etime;
		this.register = register;
		this.filing_time = filing_time;
		this.detail = detail;
		this.demand = demand;
		this.states = states;
	}

    
	public Postjob(int foid, int soid, int toid, int fpid, int spid) {
		super();
		this.foid = foid;
		this.soid = soid;
		this.toid = toid;
		this.fpid = fpid;
		this.spid = spid;
	}


	public Postjob(String posttype, int personnumber, Date etime, String register, Date filing_time, String detail,
			String demand, String firstorg, String secondorg, String thirdorg, String firstpost, String secondpost) {
		super();
		this.posttype = posttype;
		this.personnumber = personnumber;
		this.etime = etime;
		this.register = register;
		this.filing_time = filing_time;
		this.detail = detail;
		this.demand = demand;
		this.firstorg = firstorg;
		this.secondorg = secondorg;
		this.thirdorg = thirdorg;
		this.firstpost = firstpost;
		this.secondpost = secondpost;
	}


	public Postjob(int id, int foid, int soid, int toid, String posttype, int fpid, int spid, int personnumber,
			Date etime, String register, Date filing_time, String detail, String demand, String states) {
		super();
		this.id = id;
		this.foid = foid;
		this.soid = soid;
		this.toid = toid;
		this.posttype = posttype;
		this.fpid = fpid;
		this.spid = spid;
		this.personnumber = personnumber;
		this.etime = etime;
		this.register = register;
		this.filing_time = filing_time;
		this.detail = detail;
		this.demand = demand;
		this.states = states;
	}


	public Postjob(int id, int foid, int soid, int toid, String posttype, int fpid, int spid, int personnumber,
			Date etime, String register, Date filing_time, String detail, String demand) {
		super();
		this.id = id;
		this.foid = foid;
		this.soid = soid;
		this.toid = toid;
		this.posttype = posttype;
		this.fpid = fpid;
		this.spid = spid;
		this.personnumber = personnumber;
		this.etime = etime;
		this.register = register;
		this.filing_time = filing_time;
		this.detail = detail;
		this.demand = demand;
	}
	
	
	public Postjob(int foid, int soid, int toid, String posttype, int fpid, int spid, int personnumber, Date etime,
			String register, Date filing_time, String detail, String demand) {
		super();
		this.foid = foid;
		this.soid = soid;
		this.toid = toid;
		this.posttype = posttype;
		this.fpid = fpid;
		this.spid = spid;
		this.personnumber = personnumber;
		this.etime = etime;
		this.register = register;
		this.filing_time = filing_time;
		this.detail = detail;
		this.demand = demand;
	}


	public String getStates() {
		return states;
	}


	public void setStates(String states) {
		this.states = states;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPosttype() {
		return posttype;
	}
	public void setPosttype(String posttype) {
		this.posttype = posttype;
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
	public int getPersonnumber() {
		return personnumber;
	}
	public void setPersonnumber(int personnumber) {
		this.personnumber = personnumber;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public Date getFiling_time() {
		return filing_time;
	}
	public void setFiling_time(Date filing_time) {
		this.filing_time = filing_time;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDemand() {
		return demand;
	}
	public void setDemand(String demand) {
		this.demand = demand;
	}


	public Postjob(String posttype, int personnumber, Date etime, String register, Date filing_time, String detail,
			String demand,String states) {
		super();
		this.posttype = posttype;
		this.personnumber = personnumber;
		this.etime = etime;
		this.register = register;
		this.filing_time = filing_time;
		this.detail = detail;
		this.demand = demand;
		this.states=states;
	}
	
	

}
