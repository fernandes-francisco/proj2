package com.example.proj2.Repo;

import com.example.proj2.Tables.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface VeiculoRepository extends JpaRepository<Veiculo, BigDecimal> {
}