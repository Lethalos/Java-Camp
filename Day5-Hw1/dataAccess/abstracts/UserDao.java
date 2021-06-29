package day5hw1.dataAccess.abstracts;

import java.util.List;

import day5hw1.entities.concretes.User;

public interface UserDao {
	
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public User get(int id);
	public List<User> getAll();

}
