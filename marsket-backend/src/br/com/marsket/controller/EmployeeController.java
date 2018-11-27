package br.com.marsket.controller;

import br.com.marsket.business.EmployeeBusiness;
import br.com.marsket.model.Employee;
import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employee")
public class EmployeeController {

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployees() {
        try {
            String response = new Gson().toJson(new EmployeeBusiness().getEmployees());
            return Response.status(200).entity(response).build();
        } catch (Exception ex) {
            return Response.serverError().status(400).build();
        }
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public String addEmployees(Employee employee) {
        try {
            new EmployeeBusiness().AddEmployee(employee);
            return Response.status(Response.Status.CREATED).toString();
        } catch (Exception ex) {
            return Response.serverError() + " " + ex.getMessage();
        }
    }
}
