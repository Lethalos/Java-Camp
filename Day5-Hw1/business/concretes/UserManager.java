package day5hw1.business.concretes;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import day5hw1.business.abstracts.UserService;
import day5hw1.core.abstracts.LoggerService;
import day5hw1.dataAccess.abstracts.UserDao;
import day5hw1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private LoggerService loggerService;

	public UserManager(UserDao userDao, LoggerService loggerService) {
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	@Override
	public void signUp(User user) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sign up");

		while (!isNameValid(user.getName())) {
			System.out.print("Invalid name. Please enter a valid name: ");
			user.setName(scanner.nextLine());
		}

		while (!isLastNameValid(user.getLastName())) {
			System.out.print("Invalid last name. Please enter a valid last name: ");
			user.setLastName(scanner.next());
		}

		while (!isEmailUsed(user.getEmail())) {
			System.out.print("Email is already registered. Please enter a new email: ");
			user.setEmail(scanner.next());
		}

		while (!isEmailValid(user.getEmail())) {
			System.out.print("Invalid email! Please enter a valid email: ");
			user.setEmail(scanner.next());
		}

		while (!isPasswordValid(user.getPassword())) {
			System.out.print("Invalid password! Please enter a valid password (min 6 characters): ");
			user.setPassword(scanner.next());
		}

		sendEmailToUser(user.getEmail());
		verifyAccount(user);

	}

	private boolean isNameValid(String name) {
		if (name.length() < 2) {
			return false;
		}

		return true;
	}

	private boolean isLastNameValid(String lastName) {
		if (lastName.length() < 2) {
			return false;
		}

		return true;
	}

	private boolean isEmailUsed(String email) {
		for (int i = 0; i < userDao.getAll().size(); i++) {
			if (email == userDao.getAll().get(i).getEmail()) {
				return false;
			}
		}

		return true;
	}

	private boolean isEmailValid(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return true;
		}

		return false;
	}

	private boolean isPasswordValid(String password) {
		if (password.length() < 6) {
			return false;
		}

		return true;
	}

	@Override
	public void signUpWithGoogle(User user) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sign up with Google");
		
		while (!isEmailUsed(user.getEmail())) {
			System.out.print("Email is already registered. Please try with another Google account: ");
			user.setEmail(scanner.next());
		}

		sendEmailToUser(user.getEmail());
		verifyAccount(user);

		loggerService.logToSystem(user.getName() + " signed up with Google account");
	}

	private void sendEmailToUser(String email) {
		System.out.println("Verification email has sent to: " + email);
	}

	private void verifyAccount(User user) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please hit enter to verify your account");

		if (scanner.nextLine() == "") {
			userDao.add(user);
		} else {
			System.out.println(user.getName() + " is not saved to the database");
		}
	}

	@Override
	public void signIn() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sign in");
		System.out.print("Email: ");
		String email = scanner.next();
		System.out.print("Password: ");
		String password = scanner.next();

		for (User user : userDao.getAll()) {	
			boolean isEmailRegistered = false;
			boolean isPasswordRegistered = false;

			if (email.equals(user.getEmail())) {
				isEmailRegistered = true;
			}

			if (password.equals(user.getPassword())) {
				isPasswordRegistered = true;
			}

			if (isEmailRegistered && isPasswordRegistered) {
				System.out.println("Welcome " + user.getName() + " have a good day");
				return;
			}
		}

		System.out.println("Email or password is wrong");
	}

}
