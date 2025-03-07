package com.example.proj2;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Reparacao\"", schema = "public")
public class Reparacao {
    @Id
    @Column(name = "\"IdReparacao\"", nullable = false, precision = 8)
    private BigDecimal id;

    @Column(name = "\"DataInicio\"")
    private LocalDate dataInicio;

    @Column(name = "\"DataFim\"")
    private LocalDate dataFim;

    @Column(name = "\"Estado\"", length = 50)
    private String estado;

    @Column(name = "\"Descricao\"", length = 100)
    private String descricao;

    @Column(name = "\"ValorTotal\"", precision = 8, scale = 2)
    private BigDecimal valorTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"nFatura\"")
    private FaturaCliente nFatura;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdVeiculo\"")
    private com.example.proj2.Veiculo idVeiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdFuncionario\"")
    private Funcionario idFuncionario;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "\"IdServico\"")
    private com.example.proj2.Servico idServico;

    @OneToMany(mappedBy = "idReparacao")
    private Set<LinhaReparacao> linhaReparacaos = new LinkedHashSet<>();

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public FaturaCliente getNFatura() {
        return nFatura;
    }

    public void setNFatura(FaturaCliente nFatura) {
        this.nFatura = nFatura;
    }

    public com.example.proj2.Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(com.example.proj2.Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public com.example.proj2.Servico getIdServico() {
        return idServico;
    }

    public void setIdServico(com.example.proj2.Servico idServico) {
        this.idServico = idServico;
    }

    public Set<LinhaReparacao> getLinhaReparacaos() {
        return linhaReparacaos;
    }

    public void setLinhaReparacaos(Set<LinhaReparacao> linhaReparacaos) {
        this.linhaReparacaos = linhaReparacaos;
    }

}