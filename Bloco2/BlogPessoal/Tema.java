package com.blogpessoal.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // para ser criada a tabela no bd
@Table(name = "tb_tema") // para criar a tabela
public class Tema {

	// colocar os get e sets para conseguir acesar isso aí para puxar ou mexer
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String descricao;

	// depois de fazer o many to one vir aqui e fzr o daqui
	@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE) // colocar remove p; nao dá erro no front
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem; // obs: se é "muitos" é uma lista, entao tem que colocar o list e importar do
										// java útil

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

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

}
