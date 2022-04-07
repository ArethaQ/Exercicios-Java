package treinandoPOO;

public class Cliente {
	
	private String nomeCompleto;
	private String plano;
	private int cpf;
	private int desde;
	
	//tornar acessivel a outras classes
	
	public Cliente (String nomeCompleto, int cpf, String plano, int desde)
	{
         this.nomeCompleto = nomeCompleto;
         this.cpf = cpf;
         this.plano = plano;
         this.desde = desde;
    }

	

	public String getNomeCompleto() {
		return nomeCompleto;
	}



	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}



	public String getPlano() {
		return plano;
	}



	public void setPlano(String plano) {
		this.plano = plano;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public int getDesde() {
		return desde;
	}



	public void setDesde(int desde) {
		this.desde = desde;
	}



	public void imprimirInfo()
	{
		System.out.println("Nome do cliente: "+nomeCompleto+"\nCpf: "+cpf+"\nPlano escolhido: "+plano+"\nCliente desde: "+desde);
		
	
	}
	
}