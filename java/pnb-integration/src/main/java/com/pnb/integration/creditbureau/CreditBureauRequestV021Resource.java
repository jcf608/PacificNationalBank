package com.pnb.integration.creditbureau;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CreditBureauRequestV021Resource — REST endpoint for CreditBureauRequestV021.
 */
@Path("/api/int/creditbureaurequest/v21")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CreditBureauRequestV021Resource {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV021Resource.class);

    @Inject
    private CreditBureauRequestV021Service service;

    @GET
    public Response list(@QueryParam("page") @DefaultValue("0") int page,
                         @QueryParam("size") @DefaultValue("20") int size) {
        LOG.debug("Listing CreditBureauRequestV021s page={}, size={}", page, size);
        List<CreditBureauRequestV021> results = service.findAll();
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
    public Response create(@Valid CreditBureauRequestV021 entity) {
        CreditBureauRequestV021 created = service.create(entity);
        return Response.status(Response.Status.CREATED)
            .entity(created).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @Valid CreditBureauRequestV021 entity) {
        CreditBureauRequestV021 updated = service.update(id, entity);
        return Response.ok(updated).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.noContent().build();
    }
}
