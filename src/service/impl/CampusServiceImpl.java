package service.impl;

import java.util.List;

import dao.IHrmDao;
import dao.impl.HrmDaoImpl;
import entity.Hrm;
import service.ICampusService;

public class CampusServiceImpl implements ICampusService {
	private IHrmDao hrmDao = new HrmDaoImpl();
	@Override
	public int addAllHrm(Hrm hrm) {
		// TODO Auto-generated method stub
		return hrmDao.addAllHrm(hrm);
	}
	@Override
	public List<Hrm> selectAllCampus() {
		// TODO Auto-generated method stub
		return hrmDao.selectAllCampus();
	}
	
}
