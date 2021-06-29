package day5hw1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5hw1.dataAccess.abstracts.UserDao;
import day5hw1.entities.concretes.User;

public class MyUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();	
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getName() + " is saved to the database");
		System.out.println(user + "\n");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(User user) {
		users.remove(user);
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}
	
}
