package br.com.marsket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.marsket.business.UserBusiness;
import br.com.marsket.model.User;

@Path("/user")
public class UserController {

    @GET
    @Path("/login/{username}/{password}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getLogin(@PathParam("username") String username,
            @PathParam("password") String password) {
        if (new UserBusiness().getLogin(username, password)) {
            return Response.status(200).build();
        } else {
            return Response.status(400).entity(
                    new Exception("Usuário ou senha inválidos.")).build();
        }
    }

    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public String addUser(User user) {
        return "" + user.getUsername() + user.getPassword();
    }

}
