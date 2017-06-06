package service;

import java.util.List;

import entity.hrm1;

public interface IAddThingService {
	public int addting(String planname,String personname,float estimatedcost,int actualshou,int aimshou,String percentcompl,int aimcheng,int actualcheng,String percentconv,String starttime,String endtime);

	public int addalldecisons(hrm1 hrms);

	public List<hrm1> Searchalldecisons(hrm1 hrms);

}
