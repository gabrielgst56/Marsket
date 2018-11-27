package br.com.marsket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.marsket.model.User;

@Path("/customer")
public class CustomerController {

	@GET
	@Path("/list")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloWorld(){
		return "Hello Customer";
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public String addCustomerr(User user){
		return ""+user.getUsername()+user.getPassword();
	}
}
