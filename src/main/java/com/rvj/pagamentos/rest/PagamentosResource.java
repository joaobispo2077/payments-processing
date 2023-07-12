package com.rvj.pagamentos.rest;

import com.rvj.pagamentos.entities.Pagamento;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/pagamentos")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.APPLICATION_JSON)
public class PagamentosResource {

    @Channel("pagamento")
    Emitter<Pagamento> pagamentoEmitter;

    @Channel("lote")
    Emitter<String> loteEmitter;

    @GET
    public Response getPagamento(@QueryParam("arquivo") String arquivo) {

        Pagamento pagamento = new Pagamento(arquivo);

        pagamentoEmitter.send(pagamento);
        loteEmitter.send(pagamento.getLote());
        System.out.println("#################");
        System.out.println(pagamento.getBanco());
        return Response.ok().build();
    }

}
