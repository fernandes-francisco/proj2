package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Peca")
public class Peca implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdPeca", nullable = false)
    private BigDecimal idPeca;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Referencia")
    private String referencia;

    @Column(name = "Preco")
    private BigDecimal preco;

    @Column(name = "Qtd")
    private BigDecimal qtd;

    // Getters e Setters

    public BigDecimal getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(BigDecimal idPeca) {
        this.idPeca = idPeca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    // Método toString() (opcional)
    @Override
    public String toString() {
        return "Peca{" +
                "idPeca=" + idPeca +
                ", nome='" + nome + '\'' +
                ", referencia='" + referencia + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}