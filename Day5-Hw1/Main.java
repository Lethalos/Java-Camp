package day5hw1;

import day5hw1.business.abstracts.UserService;
import day5hw1.business.concretes.UserManager;
import day5hw1.core.concretes.JGoogleLoggerManagerAdapter;
import day5hw1.dataAccess.concretes.MyUserDao;
import day5hw1.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		UserService userService = new UserManager(new MyUserDao(), new JGoogleLoggerManagerAdapter());
		
		User u1 = new User(1, "Kaan", "Ozdo", "kaan123@hotmail.com", "kaan123");
		User u2 = new User(2, "John", "Doe", "kaan123@hotmail.com", "123456");
		User googleUser = new User(3, "Ahmet", "Yilmaz", "ahmet123@gmail.com", "123456");
		
		userService.signUp(u1);
		userService.signUp(u2);
		userService.signUpWithGoogle(googleUser);
		userService.signIn();
		
	}

}
