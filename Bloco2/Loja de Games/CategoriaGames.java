package com.lojadegames.lojadegames.model;

//categoria é baseado em temas d blog pessoal
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoriagames")
public class CategoriaGames {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 255)
	private String descricao;
	
	//começando a referenciar:
	@OneToMany(mappedBy = "categoriagames", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoriagames")
	private List<ProdutoGames> produtogames;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ProdutoGames> getProdutogames() {
		return produtogames;
	}

	public void setProdutogames(List<ProdutoGames> produtogames) {
		this.produtogames = produtogames;
	}
	
	
}
