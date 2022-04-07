package treinandoPOO;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Fátima Lima",685900456,"Premium",2015);
		cliente1.imprimirInfo();
		
		System.out.println("\n\t Troca de participante ativo da lista VIP de Clientes:");
		
		cliente1.setNomeCompleto("Núbia Barros");
		cliente1.setCpf(986765554);
		cliente1.setPlano("Premium");
		cliente1.setDesde(2017);
		cliente1.imprimirInfo();
		
		
	}

}
