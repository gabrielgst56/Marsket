package br.com.marsket.business;

import java.util.ArrayList;

import br.com.marsket.model.Customer;
import br.com.marsket.repository.CustomerRepository;

public class CustomerBusiness {

	public void AddCustomer(Customer customer){
		new CustomerRepository().insert(customer);
	}
	public ArrayList<Customer> getCustomers(){
		return new CustomerRepository().getAll();
	}
}
