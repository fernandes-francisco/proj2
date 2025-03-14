package com.example.proj2.Repo;

import com.example.proj2.Tables.EncomendaFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EncomendaFornecedorRepository extends JpaRepository<EncomendaFornecedor, BigDecimal>, JpaSpecificationExecutor<EncomendaFornecedor> {

}