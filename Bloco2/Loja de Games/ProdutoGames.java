package com.lojadegames.lojadegames.model;

//baseado em postagem do blog pessoal
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtogames")
public class ProdutoGames {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // importar id e generated
	private long id;

	@NotBlank
	@Size(min = 3, max = 255) // importar notb e size
	private String nome;
	
	@NotBlank
	@Size(min = 3, max= 255)
	private String marca;

	@NotBlank
	@Size(min = 3, max = 1500)
	private String descricao;

	@Size(min = 3, max = 255)
	private String imagem;

	@ManyToOne
	@JsonIgnoreProperties("produtogames")
	private CategoriaGames categoriagames;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public CategoriaGames getCategoriagames() {
		return categoriagames;
	}

	public void setCategoriagames(CategoriaGames categoriagames) {
		this.categoriagames = categoriagames;
	}
	
	
}
