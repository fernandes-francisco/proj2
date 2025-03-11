package com.example.proj2.Tables;

import jakarta.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "CodPostal", schema = "public")
public class CodPostal {
    @Id
    @Column(name = "CodPostal", length = 10, nullable = false, unique = true)
    private String codPostal;

    @Column(name = "Descricao", length = 50)
    private String descricao;

    @OneToMany(mappedBy = "codPostal")
    private Set<Cliente> clientes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "codPostal")
    private Set<Fornecedor> fornecedores = new LinkedHashSet<>();

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Set<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
}
