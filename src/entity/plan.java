package entity;

public class plan {
	private String planname;
	private String personname;
	private float estimatedcost;
	private int actualshou;
	private int aimshou;
	private String percentcompl;
	private int aimcheng;
	private int actualcheng;
	private String percentconv;
	private String starttime;
	private String endtime;
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public float getEstimatedcost() {
		return estimatedcost;
	}
	public void setEstimatedcost(float estimatedcost) {
		this.estimatedcost = estimatedcost;
	}
	public int getActualshou() {
		return actualshou;
	}
	public void setActualshou(int actualshou) {
		this.actualshou = actualshou;
	}
	public int getAimshou() {
		return aimshou;
	}
	public void setAimshou(int aimshou) {
		this.aimshou = aimshou;
	}
	public int getAimcheng() {
		return aimcheng;
	}
	public void setAimcheng(int aimcheng) {
		this.aimcheng = aimcheng;
	}
	public int getActualcheng() {
		return actualcheng;
	}
	public void setActualcheng(int actualcheng) {
		this.actualcheng = actualcheng;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getPercentcompl() {
		return percentcompl;
	}
	public void setPercentcompl(String percentcompl) {
		this.percentcompl = percentcompl;
	}
	public String getPercentconv() {
		return percentconv;
	}
	public void setPercentconv(String percentconv) {
		this.percentconv = percentconv;
	}
	
	public plan(String planname, String personname, float estimatedcost, int actualshou, int aimshou,
			String percentcompl, int aimcheng, int actualcheng, String percentconv, String starttime, String endtime) {
		super();
		this.planname = planname;
		this.personname = personname;
		this.estimatedcost = estimatedcost;
		this.actualshou = actualshou;
		this.aimshou = aimshou;
		this.percentcompl = percentcompl;
		this.aimcheng = aimcheng;
		this.actualcheng = actualcheng;
		this.percentconv = percentconv;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	public plan() {
		super();
	}
	

}
