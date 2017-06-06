package service.impl;

import java.util.List;

import dao.ILoginDao;
import dao.impl.LoginDaoImpl;
import entity.User;
import service.ILoginService;

public class LoginServiceImpl implements ILoginService {
	private ILoginDao login = new LoginDaoImpl();
	

	@Override
	public User executeLogin(String name, String password) {
		// TODO Auto-generated method stub
		User user = null;
		List<User> users = login.selectUser(name);
		if(users==null||users.size()==0){//根本不存在用户名为username的用户
			return null;
		}else{
			//遍历所有用户 ，查询是否有密码一致的
			for(User u : users){
				if(u.getPassword().equals(password)){
					user = u;
				}
			}
			
			return user;
		}
	}
	

}
