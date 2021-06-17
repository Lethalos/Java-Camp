package GameBackend.Abstract;

import GameBackend.Entities.Customer;

public interface CustomerService {
	public void save(Customer customer);
	public void update(Customer customer);
	public void delete(Customer customer);
}
