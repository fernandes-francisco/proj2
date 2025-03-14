package com.example.proj2.Repo;

import com.example.proj2.Tables.Peca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PecaRepository extends JpaRepository<Peca, BigDecimal>, JpaSpecificationExecutor<Peca> {

}