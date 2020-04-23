package com.gerson.controlmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerson.controlmoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}
