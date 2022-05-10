package com.lojadegames.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lojadegames.lojadegames.model.CategoriaGames;



public interface CategoriaGamesRepository extends JpaRepository<CategoriaGames, Long>{
		public List<CategoriaGames> findAllByDescricaoContainingIgnoreCase (@Param("descricao")String descricao);
	}

