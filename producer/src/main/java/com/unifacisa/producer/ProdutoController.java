package com.unifacisa.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

  @Autowired
  private RestSource restSource;

  @Autowired
  private RestProducer restProducer;

  @PostMapping("/process")
  public ResponseEntity<Message> processProduct(@RequestBody Produto product){
    boolean result = restProducer.enviarMessagemProduto(product, restSource);

    Message messageResult = new Message("Operação realizada com sucesso? " + result, System.currentTimeMillis());
    return ResponseEntity.ok(messageResult);
  }
}
