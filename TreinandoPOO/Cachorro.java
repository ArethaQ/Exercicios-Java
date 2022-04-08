package treinandoPOO;

public class Cachorro extends Animal{
	
	private String resgatadoDesde;

	public Cachorro(String nome, int idade, String deveEmitirSom, String deveCorrer, String resgatadoDesde)
	{
		super(nome,idade,deveEmitirSom,deveCorrer);
		this.resgatadoDesde = resgatadoDesde;
		
	}
	
	public String getResgatadoDesde() {
		return resgatadoDesde;
	}



	public void setResgatadoDesde(String resgatadoDesde) {
		this.resgatadoDesde = resgatadoDesde;
	}


	public void imprimirInfoA1()
	{
		System.out.println("\nNome do cachorro: " + getNome()+ "\n"+"Idade do cachorro: "+getIdade()+ "\n"+ 
	"Emite Som: " + getDeveEmitirSom() + "\n"+ "Corre: " + getDeveCorrer() + "\n" + "Ano do resgate do animal: "+resgatadoDesde);
	}
}
