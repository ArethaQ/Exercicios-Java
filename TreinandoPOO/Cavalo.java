package treinandoPOO;

public class Cavalo extends Animal{

		private String temperamento;

		public Cavalo(String nome, int idade, String deveEmitirSom, String deveCorrer, String temperamento)
		{
			super(nome,idade,deveEmitirSom,deveCorrer);
			this.temperamento = temperamento;
			
		}
		
		
		public String getTemperamento() {
			return temperamento;
		}


		public void setTemperamento(String temperamento) {
			this.temperamento = temperamento;
		}


		public void imprimirInfoA2()
		{
			System.out.println("\nNome do cavalo: " + getNome()+ "\n"+"Idade do cavalo: "+getIdade()+ "\n"+ 
		    "Emite Som: " + getDeveEmitirSom() + "\n"+ "Corre: " + getDeveCorrer() + "\n" + 
			"Temperamento do animal: "+temperamento);
		}
}
