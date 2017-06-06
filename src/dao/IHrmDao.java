package dao;

import java.util.List;

import entity.Hrm;

public interface IHrmDao {

	public int addAllHrm(Hrm hrm);

	public List<Hrm> selectAllCampus();

}
