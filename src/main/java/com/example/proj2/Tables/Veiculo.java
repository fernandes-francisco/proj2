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
@Table(name = "Veiculo")
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdVeiculo", nullable = false)
    private BigDecimal idVeiculo;

    @Column(name = "Matricula")
    private String matricula;

    @Column(name = "Marca")
    private String marca;

    @Column(name = "Modelo")
    private String modelo;

    @Column(name = "Ano")
    private BigDecimal ano;

    @Column(name = "IdCliente")
    private BigDecimal idCliente;

}
