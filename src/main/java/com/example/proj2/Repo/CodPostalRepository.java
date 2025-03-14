package com.example.proj2.Repo;

import com.example.proj2.Tables.CodPostal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CodPostalRepository extends JpaRepository<CodPostal, String>, JpaSpecificationExecutor<CodPostal> {

}