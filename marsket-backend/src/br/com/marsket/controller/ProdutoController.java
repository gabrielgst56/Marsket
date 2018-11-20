package br.com.marsket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/produto")
public class ProdutoController {

	//List<Integer> lst;
	
	//@PostConstruct
	//private void init() {
	//	lst = new ArrayList<>();
	//}
	
	@GET
	//@Path("/list")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloWorld(){
		return "Hello World";
	}
	
	
	
}
