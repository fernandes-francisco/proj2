package com.example.proj2.Repo;

import com.example.proj2.Tables.LinhaReparacao;
import com.example.proj2.Tables.LinhaReparacaoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinhaReparacaoRepository extends JpaRepository<LinhaReparacao, LinhaReparacaoId> {
}