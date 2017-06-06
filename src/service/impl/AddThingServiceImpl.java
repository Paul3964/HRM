package service.impl;

import java.util.List;

import dao.IAddThingDao;
import dao.impl.AddThingDaoImpl;
import entity.hrm1;
import service.IAddThingService;

public class AddThingServiceImpl implements IAddThingService {
	private IAddThingDao addthingDao=new AddThingDaoImpl();
	@Override
	public int addting(String planname, String personname, float estimatedcost, int actualshou, int aimshou,
			String percentcompl, int aimcheng, int actualcheng, String percentconv, String starttime, String endtime) {
		// TODO Auto-generated method stub
		return addthingDao.addting(planname, personname, estimatedcost, actualshou, aimshou, percentcompl, aimcheng, actualcheng, percentconv, starttime, endtime);
	}
	@Override
	public int addalldecisons(hrm1 hrms) {
		// TODO Auto-generated method stub
		return addthingDao.addallDecition(hrms);
	}
	@Override
	public List<hrm1> Searchalldecisons(hrm1 hrms) {
		// TODO Auto-generated method stub
		return addthingDao.Searchalldecision(hrms);
	}

}
