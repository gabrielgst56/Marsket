package br.com.marsket.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.marsket.business.ProductBusiness;
import br.com.marsket.business.UserBusiness;
import br.com.marsket.model.Product;

@Path("/product")
public class ProductController {
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProducts(){
		
		String response = new Gson().toJson(new ProductBusiness().getProducts());
		
		return Response.status(200).entity(response).build();
				
	}
}
