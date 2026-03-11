package org.oxerr.stubhub.client.cxf.resource;

import org.oxerr.stubhub.client.model.HealthCheckResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/healthcheck")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface HealthCheckResource {

	@GET
	@Path("/simple")
	HealthCheckResponse simple();

}
