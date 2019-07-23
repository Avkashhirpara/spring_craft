package  com.firstcraft.service;

import java.util.List;


import com.firstcraft.entity.Customer;
import com.firstcraft.exception.ResourceNotFoundException;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(Long theId) throws ResourceNotFoundException;

	public void deleteCustomer(Long theId) throws ResourceNotFoundException;
	
}
