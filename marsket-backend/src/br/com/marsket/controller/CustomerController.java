package br.com.marsket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerController {

	@GET
	@Path("/list")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloWorld(){
		return "Hello Customer";
	}
}
