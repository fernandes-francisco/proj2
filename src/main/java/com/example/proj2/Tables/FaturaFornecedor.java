package com.example.proj2.Tables;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"FaturaFornecedor\"", schema = "public")
public class FaturaFornecedor {
    @Id
    @Column(name = "\"IdFaturaFornecedor\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Data\"")
    private LocalDate data;

    @Column(name = "\"ValorTotal\"", precision = 8, scale = 2)
    private BigDecimal valorTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdEncFornecedor\"")
    private EncomendaFornecedor idEncFornecedor;

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

    public EncomendaFornecedor getIdEncFornecedor() {
        return idEncFornecedor;
    }

    public void setIdEncFornecedor(EncomendaFornecedor idEncFornecedor) {
        this.idEncFornecedor = idEncFornecedor;
    }

}