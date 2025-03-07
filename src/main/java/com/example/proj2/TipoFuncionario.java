package com.example.proj2;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"TipoFuncionario\"", schema = "public")
public class TipoFuncionario {
    @Id
    @Column(name = "\"IdTipo\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"TipoFuncionario\"", length = 50)
    private String tipoFuncionario;

    @OneToMany(mappedBy = "tipo")
    private Set<Funcionario> funcionarios = new LinkedHashSet<>();

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Set<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

}