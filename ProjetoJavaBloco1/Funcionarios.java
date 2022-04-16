package ProjetoJavaBloco1;

public class Funcionarios extends Postinho {

	private String funcao;
	private String setor;
	private String localdetrabalho;
	private Double salario;

	public Funcionarios(String nome, String funcao, String setor, String localdetrabalho, Double salario) {

		super(nome);
		this.funcao = funcao;
		this.setor = setor;
		this.localdetrabalho = localdetrabalho;
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getLocaldetrabalho() {
		return localdetrabalho;
	}

	public void setLocaldetrabalho(String localdetrabalho) {
		this.localdetrabalho = localdetrabalho;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public void nome(String nome) {
		System.out.println("\n");
	}

	@Override
	public void idade(int idade) {
		System.out.println("\n");
	}

	@Override
	public void telefone(String telefone) {
		System.out.println("\n");
	}

	@Override
	public void endereco(String endereco) {
		System.out.println("\n");
	}

	@Override
	public void cpf(String cpf) {
		System.out.println("\n");
	}

	public void imprimeCartao(Funcionarios func) {
		System.out.println("#############################");
		System.out.println("#       CARTÃO DO FUNCIONÁRIO");
		System.out.println("#   Nome: " + func.getNome());
		System.out.println("#   Funcao: " + func.getFuncao());
		System.out.println("#   Setor: " + func.getSetor());
		System.out.println("#   Local de trabalho: " + func.getLocaldetrabalho());
		System.out.printf("#   Salário: R$ %.2f", func.getSalario());
		System.out.println("\n#############################");
		System.out.println("\n");
	}

}
