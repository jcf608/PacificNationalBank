package com.pnb.channel.online;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OnlineBankingSessionV011Resource — REST endpoint for OnlineBankingSessionV011.
 */
@Path("/api/onlinebankingsession/v11")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OnlineBankingSessionV011Resource {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV011Resource.class);

    @Inject
    private OnlineBankingSessionV011Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing OnlineBankingSessionV011s page={}, size={}", page, size);
        List<OnlineBankingSessionV011> results = service.findAll();
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
    public Response create(@Valid OnlineBankingSessionV011 entity) {
        OnlineBankingSessionV011 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid OnlineBankingSessionV011 entity) {
        OnlineBankingSessionV011 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
