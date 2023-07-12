package com.rvj.pagamentos.consumer;

import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ConsumerPagamento {

    @Inject
    Logger log;

    @Incoming("abc")
    public void process(JsonObject pagamento) {
        log.info("================================");
        System.out.println("######ConsumerPagamento.process");
        System.out.println("@@@@@@@@@@@@@@@@@@");
        System.out.println(pagamento.toString());
        log.info("================================");
        System.out.println("@@@@@@@@@@@@@@@@@@");
        log.info("================================");
    }
}
