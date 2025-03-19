package com.example.proj2.Repo;

import com.example.proj2.Tables.Peca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PecaRepository extends JpaRepository<Peca, BigDecimal> {
}