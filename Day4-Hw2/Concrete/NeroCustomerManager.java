package Odev.Concrete;

import Odev.Abstract.BaseCustomerManager;
import Odev.Abstract.CustomerCheckService;
import Odev.Entities.Customer;


public class NeroCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {			
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
}
 