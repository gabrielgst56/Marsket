package br.com.marsket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.marsket.model.User;

@Path("/user")
public class UserController {

	@GET
	@Path("/login")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean getLogin(String login, String passworld){
		return false;
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	public String addUser(User user){
		return "User World";
	}
	
}
