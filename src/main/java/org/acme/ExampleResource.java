package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/internal")
public class ExampleResource {

    @GET
    @Path("/ready")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ready() {
        return Response.ok().build();
    }

    @GET
    @Path("/alive")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alive() {
        return Response.ok().build();
    }
}