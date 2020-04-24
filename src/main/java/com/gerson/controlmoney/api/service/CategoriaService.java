package com.gerson.controlmoney.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gerson.controlmoney.api.model.Categoria;
import com.gerson.controlmoney.api.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria salvar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public ResponseEntity<Categoria> buscar(Long codigo){
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		
		if(categoria.isPresent()) {
			return ResponseEntity.ok(categoria.get());
		}
		return ResponseEntity.notFound().build();
	}
}
