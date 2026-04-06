package com.test.doa;
import java.util.List;
import com.test.model.Customer;
public interface CustomerDao {

	public void saveCustomer(Customer obj);
	public List<Customer> listAllCustomers();
}
