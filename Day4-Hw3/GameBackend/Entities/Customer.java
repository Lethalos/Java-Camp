package GameBackend.Entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;

	// Mernis variables
	private String name;
	private String lastName;
	private String nationaltyId;
	private int dateOfBirth;

	private String userName;
	private String email;
	private String password;
	private float balance;
	
	public List<Game> gameLibrary = new ArrayList<Game>();

	public Customer() {
		
	}

	public Customer(int id, String name, String lastName, String nationaltyId, int dateOfBirth, String userName,
			String email, String password, float balance) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.dateOfBirth = dateOfBirth;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", lastName=" + lastName + ", nationaltyId=" + nationaltyId
				+ ", dateOfBirth=" + dateOfBirth + ", userName=" + userName + ", email=" + email + ", password="
				+ password + ", balance=" + balance + ", gameLibrary=" + gameLibrary + "]";
	}
}
