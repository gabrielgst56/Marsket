package br.com.marsket.test;

import br.com.marsket.controller.CustomerController;
import br.com.marsket.controller.ProductController;
import br.com.marsket.model.Customer;
import br.com.marsket.repository.CustomerRepository;
import java.util.LinkedList;

import javax.ws.rs.core.Response;

public class MainCustomer {

    public static void main(String[] args) {

   /*     StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });
    	

    	CustomerRepository repositorio = new CustomerRepository();
    	
    	LinkedList<Customer> customers  =  repositorio.getAll();
    	for(Customer customer : customers) {
    		System.out.println(customer.getFirstName());
    	}
    	repositorio.delete(2);
    	System.out.println("---");
    	
    	CustomerRepository repositorio2 = new CustomerRepository();
    	customers  =  repositorio2.getAll();
    	for(Customer customer : customers) {
    		System.out.println(customer.getFirstName());
    	}*/
    	
    	CustomerController control = new CustomerController();
    	Response re = control.getCustomers();
    	ProductController control2 = new ProductController();
    	control2.getProducts();
    	//Response re = control.getProducts();
    	
    	//System.out.println(re);
    	
    }

}
