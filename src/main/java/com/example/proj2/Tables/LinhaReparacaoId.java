package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class LinhaReparacaoId implements java.io.Serializable {
    private static final long serialVersionUID = -2262918964513069429L;
    @Column(name = "\"IdReparacao\"", nullable = false, precision = 8)
    private BigDecimal idReparacao;

    @Column(name = "\"IdPeca\"", nullable = false, precision = 8)
    private BigDecimal idPeca;

    public BigDecimal getIdReparacao() {
        return idReparacao;
    }

    public void setIdReparacao(BigDecimal idReparacao) {
        this.idReparacao = idReparacao;
    }

    public BigDecimal getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(BigDecimal idPeca) {
        this.idPeca = idPeca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LinhaReparacaoId entity = (LinhaReparacaoId) o;
        return Objects.equals(this.idReparacao, entity.idReparacao) &&
                Objects.equals(this.idPeca, entity.idPeca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReparacao, idPeca);
    }

}