package com.example.proj2.Repo;

import com.example.proj2.Tables.TipoFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TipoFuncionarioRepository extends JpaRepository<TipoFuncionario, BigDecimal>, JpaSpecificationExecutor<TipoFuncionario> {

}