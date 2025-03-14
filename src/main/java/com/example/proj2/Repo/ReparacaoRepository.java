package com.example.proj2.Repo;

import com.example.proj2.Tables.Reparacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ReparacaoRepository extends JpaRepository<Reparacao, BigDecimal>, JpaSpecificationExecutor<Reparacao> {

}