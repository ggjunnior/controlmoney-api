package com.gerson.controlmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerson.controlmoney.api.model.Lancamento;
import com.gerson.controlmoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{
	
}
