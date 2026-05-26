package com.pnb.channel.mobile;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MobilePaymentV029Resource — REST endpoint for MobilePaymentV029.
 */
@Path("/api/mobilepayment/v29")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MobilePaymentV029Resource {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV029Resource.class);

    @Inject
    private MobilePaymentV029Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing MobilePaymentV029s page={}, size={}", page, size);
        List<MobilePaymentV029> results = service.findAll();
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
    public Response create(@Valid MobilePaymentV029 entity) {
        MobilePaymentV029 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid MobilePaymentV029 entity) {
        MobilePaymentV029 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
