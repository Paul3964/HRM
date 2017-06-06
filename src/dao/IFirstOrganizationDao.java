package dao;

import java.util.List;

import entity.Organization;
import entity.Post;

public interface IFirstOrganizationDao {

	public List<Organization> getAllfirst();

	public List<Organization> getAllSecond(int id);

	public List<Organization> getAllThird(int id);

	public List<Post> getAllfpost(int id);

	public List<Post> getAllspost(int id);

	public List<Post> getAlltpost(int id);

}
