package com.example.proj2.Repo;

import com.example.proj2.Tables.Reparacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ReparacaoRepository extends JpaRepository<Reparacao, BigDecimal> {
}