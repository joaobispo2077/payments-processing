package com.rvj.pagamentos.rest;

import com.rvj.pagamentos.entities.Pagamento;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pagamentos")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.APPLICATION_JSON)
public class PagamentosResource {

    @GET
    public Response getPagamento(@QueryParam("arquivo") String arquivo) {
        return Response.ok(new Pagamento(arquivo)).build();
    }
}
