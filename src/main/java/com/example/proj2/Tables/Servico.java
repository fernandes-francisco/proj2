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
@Table(name = "Servico")
public class Servico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdServico", nullable = false)
    private BigDecimal idServico;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Descricao")
    private String descricao;

}
