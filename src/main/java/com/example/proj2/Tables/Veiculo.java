package com.example.proj2.Tables;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Veiculo\"", schema = "public")
public class Veiculo {
    @Id
    @Column(name = "\"IdVeiculo\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Matricula\"", length = 15)
    private String matricula;

    @Column(name = "\"Marca\"", length = 50)
    private String marca;

    @Column(name = "\"Modelo\"", length = 50)
    private String modelo;

    @Column(name = "\"Ano\"", precision = 4)
    private BigDecimal ano;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdCliente\"")
    private Cliente idCliente;

    @OneToMany(mappedBy = "idVeiculo")
    private Set<Agendamento> agendamentos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idVeiculo")
    private Set<Reparacao> reparacaos = new LinkedHashSet<>();

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getAno() {
        return ano;
    }

    public void setAno(BigDecimal ano) {
        this.ano = ano;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Set<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(Set<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public Set<Reparacao> getReparacaos() {
        return reparacaos;
    }

    public void setReparacaos(Set<Reparacao> reparacaos) {
        this.reparacaos = reparacaos;
    }

}