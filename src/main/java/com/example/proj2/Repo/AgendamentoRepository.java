package com.example.proj2.Repo;

import com.example.proj2.Tables.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AgendamentoRepository extends JpaRepository<Agendamento, BigDecimal>, JpaSpecificationExecutor<Agendamento> {

}