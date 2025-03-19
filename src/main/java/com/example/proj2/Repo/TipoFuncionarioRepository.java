package com.example.proj2.Repo;

import com.example.proj2.Tables.TipoFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface TipoFuncionarioRepository extends JpaRepository<TipoFuncionario, BigDecimal> {
}