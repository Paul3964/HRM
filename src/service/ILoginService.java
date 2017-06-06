package service;

import java.util.List;
import entity.User;

public interface ILoginService {


	public User executeLogin(String name, String password);

}
