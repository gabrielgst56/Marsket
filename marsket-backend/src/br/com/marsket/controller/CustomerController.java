package br.com.marsket.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import br.com.marsket.model.Customer;
import br.com.marsket.business.CustomerBusiness;

@Path("/customer")
public class CustomerController {

	  	@GET
	    @Path("/list")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getProducts() {
	        try {
	            String response = new Gson().toJson(new CustomerBusiness().getCustomers());
	            return Response.status(200).entity(response).build();
	        } catch (Exception ex) {
	            return Response.serverError().status(400).build();
	        }
	    }

	    @GET
	    @Path("/get/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getCustomer(@PathParam("id") int id) {
	        try {
	            String response = new GsonBuilder().setPrettyPrinting().create().toJson(new CustomerBusiness().getCustomer(id));
	            return Response.status(200).entity(response).build();
	        } catch (Exception ex) {
	            return Response.serverError().status(400).build();
	        }
	    }

	    @POST
	    @Path("/add")
	    @Produces(MediaType.APPLICATION_JSON)
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response addCustomer(@PathParam("customer") String jsonCustomer) {
	        try {
	            new CustomerBusiness().AddCustomer(new Gson().fromJson(jsonCustomer, Customer.class));
	            return Response.ok().status(Status.OK).build();
	        } catch (JsonSyntaxException ex) {
	            return Response.serverError().status(400).build();
	        }
	    }

	    @PUT
	    @Path("/att")
	    @Produces(MediaType.APPLICATION_JSON)
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response attCustomer(@PathParam("customer") String jsonCustomer) {
	        try {
	        	new CustomerBusiness().updateCustomer(new Gson().fromJson(jsonCustomer, Customer.class));
	            return Response.ok().status(Status.OK).build();
	        } catch (JsonSyntaxException ex) {
	            return Response.serverError().status(400).build();
	        }
	    }

	    @DELETE
	    @Path("/del/{id}")
	    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response delCustomer(@PathParam("id") int id) {
	        try {
	            new CustomerBusiness().removeCustomer(id);
	            return Response.ok().status(Status.OK).build();
	        } catch (JsonSyntaxException ex) {
	            return Response.serverError().status(400).build();
	        }
	    }
}
