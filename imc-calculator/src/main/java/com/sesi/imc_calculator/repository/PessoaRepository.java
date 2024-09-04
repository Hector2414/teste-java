package com.sesi.imc_calculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.imc_calculator.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
