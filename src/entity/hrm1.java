package entity;

public class hrm1 {
    private Integer id;

    private String aimcourse;

    private Integer aimnum;

    private Integer actnum;

    private String createtime;

    private String stoptime;

    private String address;

    private String ftestname;

    private String stestname;

    public hrm1(Integer id, String aimcourse, Integer aimnum, Integer actnum, String createtime, String stoptime,
			String address, String ftestname, String stestname) {
		super();
		this.id = id;
		this.aimcourse = aimcourse;
		this.aimnum = aimnum;
		this.actnum = actnum;
		this.createtime = createtime;
		this.stoptime = stoptime;
		this.address = address;
		this.ftestname = ftestname;
		this.stestname = stestname;
	}

	public hrm1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAimcourse() {
        return aimcourse;
    }

    public void setAimcourse(String aimcourse) {
        this.aimcourse = aimcourse == null ? null : aimcourse.trim();
    }

    public Integer getAimnum() {
        return aimnum;
    }

    public void setAimnum(Integer aimnum) {
        this.aimnum = aimnum;
    }

    public Integer getActnum() {
        return actnum;
    }

    public void setActnum(Integer actnum) {
        this.actnum = actnum;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFtestname() {
        return ftestname;
    }

    public void setFtestname(String ftestname) {
        this.ftestname = ftestname == null ? null : ftestname.trim();
    }

    public String getStestname() {
        return stestname;
    }

    public void setStestname(String stestname) {
        this.stestname = stestname == null ? null : stestname.trim();
    }
}