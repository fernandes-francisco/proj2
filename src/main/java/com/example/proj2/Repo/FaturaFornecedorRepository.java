package com.example.proj2.Repo;

import com.example.proj2.Tables.FaturaFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface FaturaFornecedorRepository extends JpaRepository<FaturaFornecedor, BigDecimal> {
}