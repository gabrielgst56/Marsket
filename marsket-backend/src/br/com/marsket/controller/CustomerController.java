package br.com.marsket.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import br.com.marsket.model.Customer;
import br.com.marsket.business.CustomerBusiness;

@Path("/customer")
public class CustomerController {

    @GET
    @Path("/list")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCustomers() {

        try {
            new CustomerBusiness().getCustomers();
        } catch (Exception ex) {

        }
        return "Hello Customer";
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addCustomer(Customer customer) {
        try {
        	
            //new CustomerBusiness().AddCustomer(customer);
            return customer.getFirstName()+"";
        } catch (Exception ex) {
            return "";
        }

    }
}
