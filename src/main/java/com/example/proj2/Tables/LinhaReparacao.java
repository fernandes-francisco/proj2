package com.example.proj2.Tables;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Entity
@Table(name = "\"LinhaReparacao\"", schema = "public")
public class LinhaReparacao {
    @EmbeddedId
    private LinhaReparacaoId id;

    @MapsId("idReparacao")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"IdReparacao\"", nullable = false)
    private Reparacao idReparacao;

    @MapsId("idPeca")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdPeca\"", nullable = false)
    private Peca idPeca;

    @Column(name = "\"Qtd\"", precision = 8)
    private BigDecimal qtd;

    public LinhaReparacaoId getId() {
        return id;
    }

    public void setId(LinhaReparacaoId id) {
        this.id = id;
    }

    public Reparacao getIdReparacao() {
        return idReparacao;
    }

    public void setIdReparacao(Reparacao idReparacao) {
        this.idReparacao = idReparacao;
    }

    public Peca getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(Peca idPeca) {
        this.idPeca = idPeca;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

}