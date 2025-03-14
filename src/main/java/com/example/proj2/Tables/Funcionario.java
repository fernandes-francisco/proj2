package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Funcionario")
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdFuncionario", nullable = false)
    private BigDecimal idFuncionario;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Tipo")
    private BigDecimal tipo;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
