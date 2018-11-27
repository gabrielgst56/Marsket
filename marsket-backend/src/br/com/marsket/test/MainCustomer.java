package br.com.marsket.test;

import br.com.marsket.controller.CustomerController;
import br.com.marsket.model.Customer;
import br.com.marsket.repository.StaticRepository;

public class MainCustomer {

	public static void main(String[] args) {
		StaticRepository.Init();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Renan");
		customer.setHaveDiscount(true);
		
		new CustomerController().addCustomer(customer);
		
		System.out.println("Test");
	}

}
