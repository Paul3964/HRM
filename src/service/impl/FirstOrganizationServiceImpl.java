package service.impl;

import java.util.List;

import dao.IFirstOrganizationDao;
import dao.impl.FirstOrganizationDaoImpl;
import entity.Organization;
import entity.Post;
import service.IFirstOrganizationService;

public class FirstOrganizationServiceImpl implements IFirstOrganizationService{
	IFirstOrganizationDao firstOrganizationDao = new FirstOrganizationDaoImpl();
	public List<Organization> getAllfirst() {
		// TODO Auto-generated method stub
		return firstOrganizationDao.getAllfirst();
	}
	@Override
	public List<Organization> getAllSecond(int id) {
		// TODO Auto-generated method stub
		return firstOrganizationDao.getAllSecond(id);
	}
	@Override
	public List<Organization> getAllThird(int id) {
		// TODO Auto-generated method stub
		return firstOrganizationDao.getAllThird(id);
	}
	@Override
	public List<Post> getAllfpost(int id) {
		// TODO Auto-generated method stub
		return firstOrganizationDao.getAllfpost(id);
	}
	@Override
	public List<Post> getAllspost(int id) {
		// TODO Auto-generated method stub
		return firstOrganizationDao.getAllspost(id);
	}
	@Override
	public List<Post> getAlltpost(int id) {
		// TODO Auto-generated method stub
		return firstOrganizationDao.getAlltpost(id);
	}
	
}
