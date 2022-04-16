package ProjetoJavaBloco1;

public class Paciente extends Postinho {

	private String BuscarConsulta;
	private String ExcluirConsulta;
	private String MarcarPediatra;
	private String MarcarClinicoG;
	private String MarcarGeriatra;
	private String MarcarDentista;
	private String VoltaConsulta;

	public Paciente(int op, String nome, String cpf, String idade, String BuscarConsulta, String ExcluirConsulta,
			String MarcarPediatra, String MarcarClinicoG, String MarcarGeriatra, String MarcarDentista,
			String VoltaConsulta) {
		super(nome, cpf, idade);
		this.BuscarConsulta = BuscarConsulta;
		this.ExcluirConsulta = ExcluirConsulta;
		this.MarcarPediatra = MarcarPediatra;
		this.MarcarClinicoG = MarcarClinicoG;
		this.MarcarGeriatra = MarcarGeriatra;
		this.MarcarDentista = MarcarDentista;
		this.VoltaConsulta = VoltaConsulta;
	}

	public String getBuscarConsulta() {
		return BuscarConsulta;
	}

	public void setBuscarConsulta(String buscarConsulta) {
		BuscarConsulta = buscarConsulta;
	}

	public String getExcluirConsulta() {
		return ExcluirConsulta;
	}

	public void setExcluirConsulta(String excluirConsulta) {
		ExcluirConsulta = excluirConsulta;
	}

	public String getMarcarPediatra() {
		return MarcarPediatra;
	}

	public void setMarcarPediatra(String marcarPediatra) {
		MarcarPediatra = marcarPediatra;
	}

	public String getMarcarClinicoG() {
		return MarcarClinicoG;
	}

	public void setMarcarClinicoG(String marcarClinicoG) {
		MarcarClinicoG = marcarClinicoG;
	}

	public String getMarcarGeriatra() {
		return MarcarGeriatra;
	}

	public void setMarcarGeriatra(String marcarGeriatra) {
		MarcarGeriatra = marcarGeriatra;
	}

	public String getMarcarDentista() {
		return MarcarDentista;
	}

	public void setMarcarDentista(String marcarDentista) {
		MarcarDentista = marcarDentista;
	}

	public String getVoltaConsulta() {
		return VoltaConsulta;
	}

	public void setVoltaConsulta(String voltaConsulta) {
		VoltaConsulta = voltaConsulta;
	}

	public void imprimeCartao(Paciente func) {
		System.out.println("#############################");
		System.out.println("#       BUSCA");
		System.out.println("#   Buscar Consulta: " + func.getBuscarConsulta());
		System.out.println("#   Local de trabalho: " + func.getExcluirConsulta());
		System.out.println("#   Clínico Geral: " + func.getMarcarClinicoG());
		System.out.println("#   Geriátra: " + func.getMarcarGeriatra());
		System.out.println("#   Pediatra: " + func.getMarcarPediatra());
		System.out.println("#   Dentista: " + func.getMarcarDentista());
		System.out.println("#   VoltaConsulta: " + func.getVoltaConsulta());
		System.out.println("#############################");
	}

	@Override
	public void nome(String nome) {
		System.out.println("\n");
	}

	@Override
	public void idade(int idade) {

	}

	@Override
	public void cpf(String cpf) {

	}

	@Override
	public void endereco(String endereco) {

	}

	@Override
	public void telefone(String telefone) {

	}

}
