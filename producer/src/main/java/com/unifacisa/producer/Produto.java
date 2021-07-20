package com.unifacisa.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

  private Integer id;
  private String nome;
  private Double preco;
  private Integer quantidade;
}
