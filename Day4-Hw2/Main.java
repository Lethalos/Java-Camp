package Odev;

import Odev.Abstract.BaseCustomerManager;
import Odev.Adapters.MernisServiceAdapter;
import Odev.Concrete.NeroCustomerManager;
import Odev.Concrete.StarbucksCustomerManager;
import Odev.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		
		Customer c1 = new Customer(1, "Kaan", "Ozdo", 1999, "11111111111");
		
		customerManager.Save(c1);
	}
}
