package br.com.marsket.controller;

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

}
