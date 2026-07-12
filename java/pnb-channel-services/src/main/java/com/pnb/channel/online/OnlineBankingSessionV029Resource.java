package com.pnb.channel.online;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OnlineBankingSessionV029Resource — REST endpoint for OnlineBankingSessionV029.
 */
@Path("/api/onlinebankingsession/v29")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OnlineBankingSessionV029Resource {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV029Resource.class);

    @Inject
    private OnlineBankingSessionV029Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing OnlineBankingSessionV029s page={}, size={}", page, size);
        List<OnlineBankingSessionV029> results = service.findAll();
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
    public Response create(@Valid OnlineBankingSessionV029 entity) {
        OnlineBankingSessionV029 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid OnlineBankingSessionV029 entity) {
        OnlineBankingSessionV029 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
