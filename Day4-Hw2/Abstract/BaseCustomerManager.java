package Odev.Abstract;

import Odev.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	public void Save(Customer customer) {
		System.out.println("Saved to db: " + customer.getFirstName());
	}
}
