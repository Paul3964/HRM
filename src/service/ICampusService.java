package service;

import java.util.List;

import entity.Hrm;

public interface ICampusService {

	public int addAllHrm(Hrm hrm);

	public List<Hrm> selectAllCampus();

}
