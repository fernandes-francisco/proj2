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
@Table(name = "LinhaEncFornecedor")
public class LinhaEncFornecedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdPeca", nullable = false)
    private BigDecimal idPeca;

    @Id
    @Column(name = "IdEncFornecedor", nullable = false)
    private BigDecimal idEncFornecedor;

    @Column(name = "Qtd")
    private BigDecimal qtd;

    @Column(name = "ValorTotal")
    private BigDecimal valorTotal;

}
