package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Peca")
public class Peca implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdPeca", nullable = false)
    private BigDecimal idPeca;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Referencia")
    private String referencia;

    @Column(name = "Preco")
    private BigDecimal preco;

    @Column(name = "Qtd")
    private BigDecimal qtd;

}
