package entity;

public class orgpost {
	private String Firstorg;
	private String Secondorg;
	private String Thirdorg;
	private String Firstpost;
	private String Secondpost;
	private String Thirdpost;
	
	
	
	public orgpost(String firstorg, String secondorg, String thirdorg, String firstpost, String secondpost) {
		super();
		Firstorg = firstorg;
		Secondorg = secondorg;
		Thirdorg = thirdorg;
		Firstpost = firstpost;
		Secondpost = secondpost;
	}
	public String getFirstorg() {
		return Firstorg;
	}
	public void setFirstorg(String firstorg) {
		Firstorg = firstorg;
	}
	public String getSecondorg() {
		return Secondorg;
	}
	public void setSecondorg(String secondorg) {
		Secondorg = secondorg;
	}
	public String getThirdorg() {
		return Thirdorg;
	}
	public void setThirdorg(String thirdorg) {
		Thirdorg = thirdorg;
	}
	public String getFirstpost() {
		return Firstpost;
	}
	public void setFirstpost(String firstpost) {
		Firstpost = firstpost;
	}
	public String getSecondpost() {
		return Secondpost;
	}
	public void setSecondpost(String secondpost) {
		Secondpost = secondpost;
	}
	public String getThirdpost() {
		return Thirdpost;
	}
	public void setThirdpost(String thirdpost) {
		Thirdpost = thirdpost;
	}
	public orgpost(String firstorg, String secondorg, String thirdorg, String firstpost, String secondpost,
			String thirdpost) {
		super();
		Firstorg = firstorg;
		Secondorg = secondorg;
		Thirdorg = thirdorg;
		Firstpost = firstpost;
		Secondpost = secondpost;
		Thirdpost = thirdpost;
	}

}
