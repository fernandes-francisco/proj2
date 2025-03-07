package com.example.proj2;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"EncomendaFornecedor\"", schema = "public")
public class EncomendaFornecedor {
    @Id
    @Column(name = "\"IdEncFornecedor\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Data\"")
    private LocalDate data;

    @Column(name = "\"ValorTotal\"", precision = 8, scale = 2)
    private BigDecimal valorTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdFornecedor\"")
    private com.example.proj2.Fornecedor idFornecedor;

    @OneToMany(mappedBy = "idEncFornecedor")
    private Set<com.example.proj2.FaturaFornecedor> faturaFornecedors = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idEncFornecedor")
    private Set<com.example.proj2.LinhaEncFornecedor> linhaEncFornecedors = new LinkedHashSet<>();

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public com.example.proj2.Fornecedor getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(com.example.proj2.Fornecedor idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Set<com.example.proj2.FaturaFornecedor> getFaturaFornecedors() {
        return faturaFornecedors;
    }

    public void setFaturaFornecedors(Set<com.example.proj2.FaturaFornecedor> faturaFornecedors) {
        this.faturaFornecedors = faturaFornecedors;
    }

    public Set<com.example.proj2.LinhaEncFornecedor> getLinhaEncFornecedors() {
        return linhaEncFornecedors;
    }

    public void setLinhaEncFornecedors(Set<com.example.proj2.LinhaEncFornecedor> linhaEncFornecedors) {
        this.linhaEncFornecedors = linhaEncFornecedors;
    }

}