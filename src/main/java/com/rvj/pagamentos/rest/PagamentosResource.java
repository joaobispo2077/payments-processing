package com.rvj.pagamentos.rest;

import com.rvj.pagamentos.entities.Controle;
import com.rvj.pagamentos.entities.Pagamento;

import com.rvj.pagamentos.entities.Servico;
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

    @GET
    public Response getPagamento(@QueryParam("arquivo") String arquivo) {

        Controle controle = new Controle(arquivo);
        Servico servico = new Servico(arquivo);
        Pagamento pagamento = new Pagamento(controle, servico);

        pagamentoEmitter.send(pagamento);
        return Response.ok(pagamento).build();
    }

}
