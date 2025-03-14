package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
@Table(name = "EncomendaFornecedor")
public class EncomendaFornecedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdEncFornecedor", nullable = false)
    private BigDecimal idEncFornecedor;

    @Column(name = "Data")
    private Date data;

    @Column(name = "ValorTotal")
    private BigDecimal valorTotal;

    @Column(name = "IdFornecedor")
    private BigDecimal idFornecedor;

}
