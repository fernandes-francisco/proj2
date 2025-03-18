package com.example.proj2.Repo;

import com.example.proj2.Tables.EncomendaFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;

public interface EncomendaFornecedorRepository extends JpaRepository<EncomendaFornecedor, BigDecimal> {
}