package com.example.proj2;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "\"Agendamento\"", schema = "public")
public class Agendamento {
    @Id
    @Column(name = "\"IdAgendamento\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"DataHora\"")
    private Instant dataHora;

    @Column(name = "\"EstadoPagamento\"", length = 20)
    private String estadoPagamento;

    @Column(name = "\"Observacoes\"", length = 100)
    private String observacoes;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "\"IdVeiculo\"")
    private com.example.proj2.Veiculo idVeiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "\"IdFuncionario\"")
    private com.example.proj2.Funcionario idFuncionario;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Instant getDataHora() {
        return dataHora;
    }

    public void setDataHora(Instant dataHora) {
        this.dataHora = dataHora;
    }

    public String getEstadoPagamento() {
        return estadoPagamento;
    }

    public void setEstadoPagamento(String estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public com.example.proj2.Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(com.example.proj2.Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public com.example.proj2.Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(com.example.proj2.Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

}