package com.example.proj2;

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
    private com.example.proj2.Reparacao idReparacao;

    @MapsId("idPeca")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdPeca\"", nullable = false)
    private com.example.proj2.Peca idPeca;

    @Column(name = "\"Qtd\"", precision = 8)
    private BigDecimal qtd;

    public LinhaReparacaoId getId() {
        return id;
    }

    public void setId(LinhaReparacaoId id) {
        this.id = id;
    }

    public com.example.proj2.Reparacao getIdReparacao() {
        return idReparacao;
    }

    public void setIdReparacao(com.example.proj2.Reparacao idReparacao) {
        this.idReparacao = idReparacao;
    }

    public com.example.proj2.Peca getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(com.example.proj2.Peca idPeca) {
        this.idPeca = idPeca;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

}