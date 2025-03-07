package com.example.proj2;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Endereco\"", schema = "public")
public class Endereco {
    @Id
    @Column(name = "\"IdEndereco\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Rua\"", length = 50)
    private String rua;

    @Column(name = "\"nPorta\"", precision = 4)
    private BigDecimal nPorta;

    @Column(name = "\"CodPostal\"", length = 10)
    private String codPostal;

    @OneToMany(mappedBy = "idEndereco")
    private Set<Cliente> clientes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idEndereco")
    private Set<com.example.proj2.Fornecedor> fornecedors = new LinkedHashSet<>();

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public BigDecimal getNPorta() {
        return nPorta;
    }

    public void setNPorta(BigDecimal nPorta) {
        this.nPorta = nPorta;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<com.example.proj2.Fornecedor> getFornecedors() {
        return fornecedors;
    }

    public void setFornecedors(Set<com.example.proj2.Fornecedor> fornecedors) {
        this.fornecedors = fornecedors;
    }

}