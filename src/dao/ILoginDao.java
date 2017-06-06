package dao;

import java.util.List;
import entity.User;

public interface ILoginDao {

	public List<User> selectUser(String username);

}
