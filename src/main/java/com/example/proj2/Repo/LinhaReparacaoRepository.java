package com.example.proj2.Repo;

import com.example.proj2.Tables.LinhaReparacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LinhaReparacaoRepository extends JpaRepository<LinhaReparacao, BigDecimal>, JpaSpecificationExecutor<LinhaReparacao> {

}