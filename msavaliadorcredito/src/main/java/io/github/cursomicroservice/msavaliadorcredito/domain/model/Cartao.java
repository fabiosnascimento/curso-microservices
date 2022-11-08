package io.github.cursomicroservice.msavaliadorcredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Cartao {

    private Long ig;
    private String nome;
    private String bandeira;
    private BigDecimal limiteBasico;
}
