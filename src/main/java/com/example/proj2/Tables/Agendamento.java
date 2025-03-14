package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "Agendamento")
public class Agendamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdAgendamento", nullable = false)
    private BigDecimal idAgendamento;

    @Column(name = "DataHora")
    private Date dataHora;

    @Column(name = "EstadoPagamento")
    private String estadoPagamento;

    @Column(name = "Observacoes")
    private String observacoes;

    @Column(name = "IdVeiculo")
    private BigDecimal idVeiculo;

    @Column(name = "IdFuncionario")
    private BigDecimal idFuncionario;

}
