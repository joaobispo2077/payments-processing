package com.rvj.pagamentos.consumer;

import com.rvj.pagamentos.entities.Pagamento;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

@ApplicationScoped
public class ConsumerPagamento {


    @Incoming("pagamento")
    public void process(Message<Pagamento> pagamento) {
        Log.info(pagamento.getPayload().toString());
    }
}
