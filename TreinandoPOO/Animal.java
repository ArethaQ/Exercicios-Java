package treinandoPOO;
/*Exercícios Herança/Polimorfismo
1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:  ANIMAL 
Cachorro Cavalo Preguiça*/

public class Animal {

	private String nome;
	private int idade;
	private String deveEmitirSom;
	private String deveCorrer;
	
	
	public Animal(String nome, int idade, String deveEmitirSom, String deveCorrer)
	{
		this.nome = nome;
		this.idade = idade;
		this.deveEmitirSom = deveEmitirSom;
		this.deveCorrer = deveCorrer;
		
	}


	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public String getDeveEmitirSom() {
		return deveEmitirSom;
	}




	public void setDeveEmitirSom(String deveEmitirSom) {
		this.deveEmitirSom = deveEmitirSom;
	}




	public String getDeveCorrer() {
		return deveCorrer;
	}




	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}


	
}