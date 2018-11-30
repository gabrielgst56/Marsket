package br.com.marsket.controller;

import br.com.marsket.business.ProductBusiness;
import br.com.marsket.model.Product;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

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

@Path("/product")
public class ProductController {

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() {
        try {
            String response = new Gson().toJson(new ProductBusiness().getProducts());
            return Response.status(200).entity(response).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProduct(@PathParam("id") int id) {
        try {
            String response = new GsonBuilder().setPrettyPrinting().create().toJson(new ProductBusiness().getProduct(id));
            return Response.status(200).entity(response).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addEmployees(Product product) {
        try {
            new ProductBusiness().AddProduct(product);
            return Response.ok().status(Status.OK).build();
        } catch (JsonSyntaxException ex) {
            return Response.serverError().status(400).build();
        }
    }

    @PUT
    @Path("/att")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response attEmployees(Product product) {
        try {
            new ProductBusiness().updateProduct(product);
            return Response.ok().status(Status.OK).build();
        } catch (JsonSyntaxException ex) {
            return Response.serverError().status(400).build();
        }
    }

    @DELETE
    @Path("/del/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response delEmployees(@PathParam("id") int id) {
        try {
            new ProductBusiness().removeProduct(id);
            return Response.ok().status(Status.OK).build();
        } catch (JsonSyntaxException ex) {
            return Response.serverError().status(400).build();
        }
    }
}
