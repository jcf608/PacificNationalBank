package com.pnb.deposit;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DepositV022Resource — REST endpoint for DepositV022.
 */
@Path("/api/deposit/v22")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepositV022Resource {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV022Resource.class);

    @Inject
    private DepositV022Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing DepositV022s page={}, size={}", page, size);
        List<DepositV022> results = service.findAll();
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
    public Response create(@Valid DepositV022 entity) {
        DepositV022 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid DepositV022 entity) {
        DepositV022 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
