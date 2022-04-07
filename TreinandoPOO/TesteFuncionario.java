package treinandoPOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario[] lista = new Funcionario[9];
		
		lista[0] = new Funcionario("Wallace Porto",3000);
		lista[1] = new Funcionario("Fábio dos Santos",3800);
		lista[2] = new Funcionario("Marília Barroso",4000);
		lista[3] = new Funcionario("Pedro Cardoso",2200);
		lista[4] = new Funcionario("Sofia Bernardes",2700);
		lista[5] = new Funcionario("Maria do Carmo",3400);
		lista[6] = new Funcionario("Josué Freitas",3300);
		lista[7] = new Funcionario("Samanta Paes",3100);
		lista[8] = new Funcionario("Jessé Alves",2900);
		
		for(Funcionario roda:lista)
		{
			roda.imprimir();
		}
		
		System.out.println("\n_______________________________________________________");
		
		System.out.println("\nAumento salárial dos funcionários do mês:");
		
		for(Funcionario roda:lista)
		{
			roda.aumentarSalario(10); // o 10 é a porcentagem que quero auemntar no salario deles
			roda.imprimir();
		}
	}

}
