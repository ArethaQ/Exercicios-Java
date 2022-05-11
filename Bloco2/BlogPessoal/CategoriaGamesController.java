package com.lojadegames.lojadegames.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojadegames.lojadegames.model.CategoriaGames;
import com.lojadegames.lojadegames.repository.CategoriaGamesRepository;


@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaGamesController {
	@Autowired
	private CategoriaGamesRepository categoriaGamesrepository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaGames>> getAll() {
		return ResponseEntity.ok(categoriaGamesrepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoriaGames> getById(@PathVariable Long id) {
		return categoriaGamesrepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<CategoriaGames>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(categoriaGamesrepository.findAllByDescricaoContainingIgnoreCase(descricao));
		/*na foto do controller está GetByTitle() e no doc da atividade está GetByDescricao(), achei mais 
		coerente colocar o descricao(), mas acho que nao têm muita importancia. */
	}
	
	@PostMapping
	public ResponseEntity<CategoriaGames> postCategoriaGames(@Valid @RequestBody CategoriaGames categoriaGames) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaGamesrepository.save(categoriaGames));
	}//
	
	@PutMapping
	public ResponseEntity<CategoriaGames> putCategoriaGames(@Valid @RequestBody CategoriaGames categoriaGames) {
		
		return categoriaGamesrepository.findById(categoriaGames.getId())
				.map(resposta -> {
					return ResponseEntity.ok().body(categoriaGamesrepository.save(categoriaGames));
				})
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}//
	
	/*@ResponseStatus(HttpStatus.NO_CONTENT)*/
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePostagem(@PathVariable Long id) {
		
		return categoriaGamesrepository.findById(id)
				.map(resposta -> {
					categoriaGamesrepository.deleteById(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
}
