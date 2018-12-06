package br.com.marsket.controller;

import br.com.marsket.business.CustomerBusiness;
import br.com.marsket.business.EmployeeBusiness;
import br.com.marsket.business.ProductBusiness;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import br.com.marsket.business.SaleBusiness;
import br.com.marsket.model.Sale;
import com.google.gson.GsonBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;

@Path("/sale")
public class SaleController {

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addSale(Sale sale) {
        try {
            String response = new Gson().toJson(new SaleBusiness().AddSale(sale));
            return Response.status(200).entity(response).build();
        } catch (JsonSyntaxException ex) {
            return Response.serverError().status(400).build();
        }
    }

    @GET
    @Path("/get/product/{barCode}/{quantity}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductBarCode(@PathParam("barCode") String barCode, @PathParam("quantity") int quantity) {
        try {
            String response = new Gson().toJson(new ProductBusiness().getProductSale(barCode, quantity));
            return Response.status(200).entity(response).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }

    @GET
    @Path("/get/customer/{cpf}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerCpf(@PathParam("cpf") String cpf) {
        try {
            String response = new Gson().toJson(new CustomerBusiness().getCustomerSale(cpf));
            return Response.status(200).entity(response).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }
}
