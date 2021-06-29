package day5hw1.business.abstracts;

import day5hw1.entities.concretes.User;

public interface UserService {

	public void signUp(User user);
	public void signUpWithGoogle(User user);
	public void signIn();

}
