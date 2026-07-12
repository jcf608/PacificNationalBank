package com.pnb.channel.online;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OnlineBankingSessionV026Resource — REST endpoint for OnlineBankingSessionV026.
 */
@Path("/api/onlinebankingsession/v26")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OnlineBankingSessionV026Resource {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV026Resource.class);

    @Inject
    private OnlineBankingSessionV026Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing OnlineBankingSessionV026s page={}, size={}", page, size);
        List<OnlineBankingSessionV026> results = service.findAll();
        return Response.ok(results).build();
    }

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        return service.findById(id)
            .map(e -> Response.ok(e).build())
            .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @POST
    public Response create(@Valid OnlineBankingSessionV026 entity) {
        OnlineBankingSessionV026 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid OnlineBankingSessionV026 entity) {
        OnlineBankingSessionV026 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
