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
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdCliente", nullable = false)
    private BigDecimal idCliente;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "NIF")
    private BigDecimal nif;

    @Column(name = "Contacto")
    private BigDecimal contacto;

    @Column(name = "IdCodPostal")
    private String idCodPostal;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
