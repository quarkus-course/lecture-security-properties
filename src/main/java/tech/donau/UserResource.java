package tech.donau;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserResource {

    @GET
    @RolesAllowed("User")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @RolesAllowed("Admin")
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/admin")
    public String adminInfo() {
        return "How to run the app: \n1:...";
    }

    @GET
    @RolesAllowed("Dev")
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/dev")
    public String devInfo() {
        return "How to ban the users: \n1:...";
    }

}