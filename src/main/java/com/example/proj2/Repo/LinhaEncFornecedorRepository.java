package com.example.proj2.Repo;

import com.example.proj2.Tables.LinhaEncFornecedor;
import com.example.proj2.Tables.LinhaEncFornecedorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinhaEncFornecedorRepository extends JpaRepository<LinhaEncFornecedor, LinhaEncFornecedorId> {
}