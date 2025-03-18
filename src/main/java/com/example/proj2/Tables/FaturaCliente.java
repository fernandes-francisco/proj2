package com.example.proj2.Tables;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"FaturaCliente\"", schema = "public")
public class FaturaCliente {
    @Id
    @Column(name = "\"nFatura\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Data\"")
    private LocalDate data;

    @Column(name = "\"ValorTotal\"", precision = 8, scale = 2)
    private BigDecimal valorTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdCliente\"")
    private Cliente idCliente;

    @OneToMany(mappedBy = "nFatura")
    private Set<Reparacao> reparacaos = new LinkedHashSet<>();

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

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Set<Reparacao> getReparacaos() {
        return reparacaos;
    }

    public void setReparacaos(Set<Reparacao> reparacaos) {
        this.reparacaos = reparacaos;
    }

}