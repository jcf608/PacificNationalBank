package com.pnb.channel.online;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OnlineBankingSessionV025Resource — REST endpoint for OnlineBankingSessionV025.
 */
@Path("/api/onlinebankingsession/v25")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OnlineBankingSessionV025Resource {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV025Resource.class);

    @Inject
    private OnlineBankingSessionV025Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing OnlineBankingSessionV025s page={}, size={}", page, size);
        List<OnlineBankingSessionV025> results = service.findAll();
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
    public Response create(@Valid OnlineBankingSessionV025 entity) {
        OnlineBankingSessionV025 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid OnlineBankingSessionV025 entity) {
        OnlineBankingSessionV025 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
