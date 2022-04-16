package ProjetoJavaBloco1;

public abstract class Postinho {
	private String nome;

	public Postinho(String nome) {
		super();
		this.nome = nome;
	}

	// Solução apresentada para o erro na class paciente "super(nome,idade,cpf);"
	public Postinho(String nome2, String cpf, String idade) {
	}

	abstract public void idade(int idade);

	abstract public void cpf(String cpf);

	abstract public void endereco(String endereco);

	abstract public void telefone(String telefone);

	abstract public void nome(String nome);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
