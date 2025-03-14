package com.example.proj2.Repo;

import com.example.proj2.Tables.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VeiculoRepository extends JpaRepository<Veiculo, BigDecimal>, JpaSpecificationExecutor<Veiculo> {

}