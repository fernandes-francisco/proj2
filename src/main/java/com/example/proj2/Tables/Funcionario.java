package com.example.proj2.Tables;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Funcionario\"", schema = "public")
public class Funcionario {
    @Id
    @Column(name = "\"IdFuncionario\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Nome\"", length = 50)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"Tipo\"")
    private TipoFuncionario tipo;

    @OneToMany(mappedBy = "idFuncionario")
    private Set<Agendamento> agendamentos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idFuncionario")
    private Set<Reparacao> reparacaos = new LinkedHashSet<>();

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
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