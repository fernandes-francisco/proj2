package com.example.proj2.Repo;

import com.example.proj2.Tables.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ServicoRepository extends JpaRepository<Servico, BigDecimal>, JpaSpecificationExecutor<Servico> {

}