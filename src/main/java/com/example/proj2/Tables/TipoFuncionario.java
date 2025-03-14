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
@Table(name = "TipoFuncionario")
public class TipoFuncionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdTipo", nullable = false)
    private BigDecimal idTipo;

    @Column(name = "TipoFuncionario")
    private String tipoFuncionario;

}
