package br.com.marsket.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.marsket.model.Customer;
import br.com.marsket.business.CustomerBusiness;
import br.com.marsket.business.ProductBusiness;

@Path("/customer")
public class CustomerController {

    @GET
    @Path("/list")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getCustomers() {
        try {
            new CustomerBusiness().getCustomers();
            return Response.status(200).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }

    @PUT
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addCustomer(Customer customer) {
        try {
            new CustomerBusiness().AddCustomer(customer);
            return Response.status(200).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }

    }
}
