package com.farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.farmacia.farmacia.model.Categoria;
import com.farmacia.farmacia.model.Produto;

@Repository
public interface CategoriaRepository extends JpaRepository<Produto, Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (@Param("descricao")String descricao);
}
