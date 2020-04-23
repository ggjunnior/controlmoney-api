package com.gerson.controlmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerson.controlmoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}
