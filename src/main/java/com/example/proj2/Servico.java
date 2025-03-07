package com.example.proj2;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Servico\"", schema = "public")
public class Servico {
    @Id
    @Column(name = "\"IdServico\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Nome\"", length = 50)
    private String nome;

    @Column(name = "\"Descricao\"", length = 100)
    private String descricao;

    @OneToMany(mappedBy = "idServico")
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Reparacao> getReparacaos() {
        return reparacaos;
    }

    public void setReparacaos(Set<Reparacao> reparacaos) {
        this.reparacaos = reparacaos;
    }

}