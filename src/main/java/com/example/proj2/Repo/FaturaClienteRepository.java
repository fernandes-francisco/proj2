package com.example.proj2.Repo;

import com.example.proj2.Tables.FaturaCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface FaturaClienteRepository extends JpaRepository<FaturaCliente, BigDecimal> {
}