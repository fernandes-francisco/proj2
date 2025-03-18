package com.example.proj2.Tables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class LinhaEncFornecedorId implements java.io.Serializable {
    private static final long serialVersionUID = -7721861047766695059L;
    @Column(name = "\"IdPeca\"", nullable = false, precision = 8)
    private BigDecimal idPeca;

    @Column(name = "\"IdEncFornecedor\"", nullable = false, precision = 8)
    private BigDecimal idEncFornecedor;

    public BigDecimal getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(BigDecimal idPeca) {
        this.idPeca = idPeca;
    }

    public BigDecimal getIdEncFornecedor() {
        return idEncFornecedor;
    }

    public void setIdEncFornecedor(BigDecimal idEncFornecedor) {
        this.idEncFornecedor = idEncFornecedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LinhaEncFornecedorId entity = (LinhaEncFornecedorId) o;
        return Objects.equals(this.idEncFornecedor, entity.idEncFornecedor) &&
                Objects.equals(this.idPeca, entity.idPeca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEncFornecedor, idPeca);
    }

}