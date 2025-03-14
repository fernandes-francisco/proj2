package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
@Table(name = "Reparacao")
public class Reparacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdReparacao", nullable = false)
    private BigDecimal idReparacao;

    @Column(name = "DataInicio")
    private Date dataInicio;

    @Column(name = "DataFim")
    private Date dataFim;

    @Column(name = "Estado")
    private String estado;

    @Column(name = "Descricao")
    private String descricao;

    @Column(name = "ValorTotal")
    private BigDecimal valorTotal;

    @Column(name = "nFatura")
    private BigDecimal nFatura;

    @Column(name = "IdVeiculo")
    private BigDecimal idVeiculo;

    @Column(name = "IdFuncionario")
    private BigDecimal idFuncionario;

    @Column(name = "IdServico")
    private BigDecimal idServico;

}
