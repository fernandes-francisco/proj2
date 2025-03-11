package com.example.proj2.Tables;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Entity
@Table(name = "\"LinhaEncFornecedor\"", schema = "public")
public class LinhaEncFornecedor {
    @EmbeddedId
    private LinhaEncFornecedorId id;

    @MapsId("idPeca")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdPeca\"", nullable = false)
    private Peca idPeca;

    @MapsId("idEncFornecedor")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdEncFornecedor\"", nullable = false)
    private EncomendaFornecedor idEncFornecedor;

    @Column(name = "\"Qtd\"", precision = 8)
    private BigDecimal qtd;

    @Column(name = "\"ValorTotal\"", precision = 8, scale = 2)
    private BigDecimal valorTotal;

    public LinhaEncFornecedorId getId() {
        return id;
    }

    public void setId(LinhaEncFornecedorId id) {
        this.id = id;
    }

    public Peca getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(Peca idPeca) {
        this.idPeca = idPeca;
    }

    public EncomendaFornecedor getIdEncFornecedor() {
        return idEncFornecedor;
    }

    public void setIdEncFornecedor(EncomendaFornecedor idEncFornecedor) {
        this.idEncFornecedor = idEncFornecedor;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

}