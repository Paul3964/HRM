package dao;

import java.util.List;
import entity.Staff;

public interface IQueryDao {
	public List<Staff> getEmplyee(int id);
}
