package com.example.proj2;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Cliente\"", schema = "public")
public class Cliente {
    @Id
    @Column(name = "\"IdCliente\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"Nome\"", length = 50)
    private String nome;

    @Column(name = "\"NIF\"", precision = 9)
    private BigDecimal nif;

    @Column(name = "\"Contacto\"", precision = 9)
    private BigDecimal contacto;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "\"IdEndereco\"")
    private com.example.proj2.Endereco idEndereco;

    @OneToMany(mappedBy = "idCliente")
    private Set<com.example.proj2.FaturaCliente> faturaClientes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCliente")
    private Set<com.example.proj2.Veiculo> veiculos = new LinkedHashSet<>();

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

    public BigDecimal getNif() {
        return nif;
    }

    public void setNif(BigDecimal nif) {
        this.nif = nif;
    }

    public BigDecimal getContacto() {
        return contacto;
    }

    public void setContacto(BigDecimal contacto) {
        this.contacto = contacto;
    }

    public com.example.proj2.Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(com.example.proj2.Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Set<com.example.proj2.FaturaCliente> getFaturaClientes() {
        return faturaClientes;
    }

    public void setFaturaClientes(Set<com.example.proj2.FaturaCliente> faturaClientes) {
        this.faturaClientes = faturaClientes;
    }

    public Set<com.example.proj2.Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<com.example.proj2.Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

}