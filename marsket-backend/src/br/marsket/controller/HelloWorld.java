package br.marsket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/teste")
public class HelloWorld {

	@GET
	@Path("/list")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloWorld(){
		return "Hello World";
	}
}
