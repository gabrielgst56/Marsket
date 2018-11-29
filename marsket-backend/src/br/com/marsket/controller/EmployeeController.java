package br.com.marsket.controller;

import br.com.marsket.business.EmployeeBusiness;
import br.com.marsket.model.Employee;

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

@Path("/employee")
public class EmployeeController {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_HTML)
    public String HelloWorld() {
        return "Hello World";
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllEmployees() {
        try {
            String response = new Gson().toJson(new EmployeeBusiness().getEmployees());
            return Response.status(200).entity(response).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployee(@PathParam("id") int id) {
        try {
            String response = new GsonBuilder().setPrettyPrinting().create().toJson(new EmployeeBusiness().getEmployee(id));
            return Response.status(200).entity(response).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addEmployees(@PathParam("employee") String jsonEmployee) {
        try {
            new EmployeeBusiness().AddEmployee(new Gson().fromJson(jsonEmployee, Employee.class));
            return Response.ok().status(Status.OK).build();
        } catch (JsonSyntaxException ex) {
            return Response.serverError().status(400).build();
        }
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response attEmployees(@PathParam("employee") String jsonEmployee) {
        try {
            new EmployeeBusiness().updateEmployee(new Gson().fromJson(jsonEmployee, Employee.class));
            return Response.ok().status(Status.OK).build();
        } catch (JsonSyntaxException ex) {
            return Response.serverError().status(400).build();
        }
    }

    @DELETE
    @Path("/del/{id}")
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delEmployees(@PathParam("id") int id) {
        try {
            new EmployeeBusiness().removeEmployee(id);
            return Response.ok().status(Status.OK).build();
        } catch (JsonSyntaxException ex) {
            return Response.serverError().status(400).build();
        }
    }
}
