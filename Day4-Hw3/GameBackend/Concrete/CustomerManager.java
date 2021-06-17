package GameBackend.Concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import GameBackend.Abstract.CustomerCheckService;
import GameBackend.Abstract.CustomerService;
import GameBackend.Entities.Customer;

public class CustomerManager implements CustomerService {
	private CustomerCheckService customerCheckService;
	
	public List<Customer> customers = new ArrayList<Customer>();

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			customers.add(customer);
			System.out.println("Customer " + customer.getName() + " saved to database.");
		}
		else {
			System.out.println("Not a valid person.");
			System.exit(0);
		}
	}

	@Override
	public void update(Customer customer) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please select what you want to update");
		System.out.println("1-) Username");
		System.out.println("2-) Email");
		System.out.println("3-) Password");
		
		int choice = scanner.nextInt();
		if(choice == 1) {
			System.out.print("Enter your new username: ");
			customer.setUserName(scanner.next());
		} else if(choice == 2) {
			System.out.println("Enter your new email: ");
			customer.setEmail(scanner.next());
		} else if(choice == 3) {
			System.out.println("Enter your new password: ");
			customer.setPassword(scanner.next());
		}
		
		scanner.close();
	}

	@Override
	public void delete(Customer customer) {
		customers.remove(customer);
		System.out.println("Customer " + customer.getName() + " deleted");
	}
}
