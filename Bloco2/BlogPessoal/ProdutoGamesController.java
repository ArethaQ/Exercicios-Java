package com.lojadegames.lojadegames.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.lojadegames.lojadegames.model.ProdutoGames;
import com.lojadegames.lojadegames.repository.CategoriaGamesRepository;
import com.lojadegames.lojadegames.repository.ProdutoGamesRepository;

@RestController
@RequestMapping("/produtogames")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoGamesController {

	@Autowired
	private ProdutoGamesRepository produtoGamesrepository;

	@Autowired
	private CategoriaGamesRepository categoriaGamesrepository;

	@GetMapping
	public ResponseEntity<List<ProdutoGames>> GetAll() {
		return ResponseEntity.ok(produtoGamesrepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProdutoGames> getById(@PathVariable Long id) {
		return produtoGamesrepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<ProdutoGames>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(produtoGamesrepository.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	@PostMapping
	public ResponseEntity<ProdutoGames> postProdutoGames(@Valid @RequestBody ProdutoGames produtogames) {
		if (categoriaGamesrepository.existsById(produtogames.getId())) // AJUSTARRRRRRRRRRRRRRRRRRRRRRRRR
			return ResponseEntity.status(HttpStatus.CREATED).body(produtoGamesrepository.save(produtogames));

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}

	@PutMapping
	public ResponseEntity<ProdutoGames> putProdutoGames(@Valid @RequestBody ProdutoGames produtogames) {

		if (produtoGamesrepository.existsById(produtogames.getId())) {

			if (categoriaGamesrepository.existsById(produtogames.getCategoriagames().getId())) // AJUSTARRRRR
				return ResponseEntity.status(HttpStatus.OK).body(produtoGamesrepository.save(produtogames));
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProdutoGames(@PathVariable Long id) {

		return produtoGamesrepository.findById(id).map(resposta -> {
			produtoGamesrepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}).orElse(ResponseEntity.notFound().build());
	}

	/*
	 * @ResponseStatus(HttpStatus.NO_CONTENT)
	 * 
	 * @DeleteMapping("/{id}") public void delete(@PathVariable Long id) {
	 * Optional<ProdutoGames> categoriaGamesrepository =
	 * categoriaGamesrepository.findById(id);
	 * 
	 * if (categoriaGamesrepository.isEmpty()) throw new
	 * ResponseStatusException(HttpStatus.NOT_FOUND);
	 * 
	 * categoriaGamesrepository.deleteById(id); }
	 */
}
