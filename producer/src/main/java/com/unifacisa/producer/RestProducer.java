package com.unifacisa.producer;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestProducer {

  public boolean enviarMessagemProduto(Produto payload, RestSource restSource){
    Message<Produto> message = MessageBuilder.withPayload(payload).build();
    boolean success = restSource.sendMessage().send(message);
    return success;
  }
}
