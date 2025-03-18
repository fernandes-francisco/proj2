package com.example.proj2.Repo;

import com.example.proj2.Tables.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;

public interface FuncionarioRepository extends JpaRepository<Funcionario, BigDecimal> {
}