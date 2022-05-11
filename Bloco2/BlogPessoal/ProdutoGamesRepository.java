package com.lojadegames.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lojadegames.lojadegames.model.ProdutoGames;

public interface ProdutoGamesRepository extends JpaRepository<ProdutoGames, Long>{
	public List<ProdutoGames> findAllByDescricaoContainingIgnoreCase (@Param("descricao")String descricao);
}
