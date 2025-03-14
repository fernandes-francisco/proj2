package com.example.proj2.Repo;

import com.example.proj2.Tables.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FuncionarioRepository extends JpaRepository<Funcionario, BigDecimal>, JpaSpecificationExecutor<Funcionario> {

}