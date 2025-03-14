package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "CodPostal")
public class CodPostal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CodPostal", nullable = false)
    private String codPostal;

    @Column(name = "Descricao")
    private String descricao;

}
