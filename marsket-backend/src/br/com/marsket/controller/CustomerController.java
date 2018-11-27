package br.com.marsket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.marsket.model.Customer;
import br.com.marsket.business.CustomerBusiness;;

@Path("/customer")
public class CustomerController {

	@GET
	@Path("/list")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCustomers(){
		
		try {
			new CustomerBusiness().getCustomers();
		}catch(Exception ex) {
			
		}
		return "Hello Customer";
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public String addCustomer(Customer customer){
		
		/*
		 * Change the return to response
		 * Case right return 200
		 * Case wrong return 400*/
		
		try {
			new CustomerBusiness().AddCustomer(customer);
			return "";
		}
		catch(Exception ex) {
			return "";
		}
		
		
		
	}
}
