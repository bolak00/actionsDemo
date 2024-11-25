package com.kaan.jakarta.hello;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("health")
public class HealthResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkHealth() {
        return Response.ok()
                .entity("{\"status\":\"UP\"}")
                .build();
    }
}