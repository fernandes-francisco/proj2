package com.example.proj2.Repo;

import com.example.proj2.Tables.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ServicoRepository extends JpaRepository<Servico, BigDecimal> {
}