package service;

import java.util.List;
import entity.Staff;

public interface IQueryService {
	public List<Staff> query(int id);
}
