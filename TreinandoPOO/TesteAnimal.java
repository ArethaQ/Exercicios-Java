package treinandoPOO;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro testeCachorro = new Cachorro ("Apollo;",7,"Au au au!;","Sim;","Em junho de 2015.");
	    Cavalo testeCavalo = new Cavalo ("Joaquim;",8,"Rimmmm!;","Sim.","Bravo");
	    Preguica testePreguica = new Preguica("Zuleide",9,"Mmm!","Não;","Sim.");
				
		testeCachorro.imprimirInfoA1();
		testeCavalo.imprimirInfoA2();
		testePreguica.imprimirInfoA3();
	}

}
