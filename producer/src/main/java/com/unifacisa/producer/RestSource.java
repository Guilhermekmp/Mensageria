package com.unifacisa.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface RestSource {

  @Output("product-process")
  public MessageChannel sendMessage();
}
