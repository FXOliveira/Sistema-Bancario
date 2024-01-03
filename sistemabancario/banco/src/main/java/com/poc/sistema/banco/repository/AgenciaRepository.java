package com.poc.sistema.banco.repository;

import com.poc.sistema.banco.model.Agencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenciaRepository extends JpaRepository<Agencia, Long> {
}
