package com.example.proj2.Repo;

import com.example.proj2.Tables.LinhaFatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LinhaFaturaRepository extends JpaRepository<LinhaFatura, BigDecimal>, JpaSpecificationExecutor<LinhaFatura> {

}