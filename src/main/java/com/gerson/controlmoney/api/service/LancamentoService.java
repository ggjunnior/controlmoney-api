package com.gerson.controlmoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerson.controlmoney.api.model.Lancamento;
import com.gerson.controlmoney.api.model.Pessoa;
import com.gerson.controlmoney.api.repository.LancamentoRepository;
import com.gerson.controlmoney.api.repository.PessoaRepository;
import com.gerson.controlmoney.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired 
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).orElse(null);
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
	
	public void excluir(Long codigo) {
		lancamentoRepository.deleteById(codigo);
	}
}
