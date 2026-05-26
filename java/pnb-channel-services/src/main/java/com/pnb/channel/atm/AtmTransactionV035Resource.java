package com.pnb.channel.atm;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AtmTransactionV035Resource — REST endpoint for AtmTransactionV035.
 */
@Path("/api/atmtransaction/v35")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AtmTransactionV035Resource {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV035Resource.class);

    @Inject
    private AtmTransactionV035Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing AtmTransactionV035s page={}, size={}", page, size);
        List<AtmTransactionV035> results = service.findAll();
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
    public Response create(@Valid AtmTransactionV035 entity) {
        AtmTransactionV035 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid AtmTransactionV035 entity) {
        AtmTransactionV035 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
