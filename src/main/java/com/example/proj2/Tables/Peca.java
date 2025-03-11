package com.example.proj2.Tables;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Peca\"", schema = "public")
public class Peca {
    @Id
    @Column(name = "\"IdPeca\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Nome\"", length = 50)
    private String nome;

    @Column(name = "\"Referencia\"", length = 50)
    private String referencia;

    @Column(name = "\"Preco\"", precision = 8, scale = 2)
    private BigDecimal preco;

    @Column(name = "\"Qtd\"", precision = 8)
    private BigDecimal qtd;

    @OneToMany(mappedBy = "idPeca")
    private Set<LinhaEncFornecedor> linhaEncFornecedors = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idPeca")
    private Set<LinhaReparacao> linhaReparacaos = new LinkedHashSet<>();

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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public Set<LinhaEncFornecedor> getLinhaEncFornecedors() {
        return linhaEncFornecedors;
    }

    public void setLinhaEncFornecedors(Set<LinhaEncFornecedor> linhaEncFornecedors) {
        this.linhaEncFornecedors = linhaEncFornecedors;
    }

    public Set<LinhaReparacao> getLinhaReparacaos() {
        return linhaReparacaos;
    }

    public void setLinhaReparacaos(Set<LinhaReparacao> linhaReparacaos) {
        this.linhaReparacaos = linhaReparacaos;
    }

}