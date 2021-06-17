package GameBackend.Abstract;

import GameBackend.Entities.Customer;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
