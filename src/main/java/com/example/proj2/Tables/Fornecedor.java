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
@Table(name = "Fornecedor")
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdFornecedor", nullable = false)
    private BigDecimal idFornecedor;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "NIF")
    private BigDecimal nif;

    @Column(name = "Contacto")
    private BigDecimal contacto;

    @Column(name = "IdCodPostal")
    private String idCodPostal;

}
