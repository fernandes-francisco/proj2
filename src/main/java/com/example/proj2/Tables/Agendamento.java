package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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

    // Getters and Setters
    public BigDecimal getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(BigDecimal idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
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

    public BigDecimal getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(BigDecimal idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public BigDecimal getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(BigDecimal idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    // toString method
    @Override
    public String toString() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", dataHora=" + dataHora +
                ", estadoPagamento='" + estadoPagamento + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", idVeiculo=" + idVeiculo +
                ", idFuncionario=" + idFuncionario +
                '}';
    }
}