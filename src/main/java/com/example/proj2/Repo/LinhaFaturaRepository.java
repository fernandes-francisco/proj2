package com.example.proj2.Repo;

import com.example.proj2.Tables.LinhaFatura;
import com.example.proj2.Tables.LinhaFaturaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinhaFaturaRepository extends JpaRepository<LinhaFatura, LinhaFaturaId> {
}