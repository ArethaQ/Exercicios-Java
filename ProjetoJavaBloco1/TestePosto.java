package ProjetoJavaBloco1;

import java.util.Scanner;

public class TestePosto {

	public static void main(String[] args) {

		int op;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n****************************************");
			System.out.println("\nSejam bem-vindes ao movimento Saúde na Rua!");
			System.out.println("\n(1) Caso você seja funcionário");
			System.out.println("\n(2) Caso você seja paciente");
			System.out.println("\n(0) Para encerrar");
			System.out.print("\n\nDigite uma opção: ");
			op = leia.nextInt();

			switch (op) {
			case 0:
				System.out.println("\nO programa foi encerrado!");
				break;

			case 1:
				leia.nextLine();
				System.out.print("Digite seu nome: ");
				String nome = leia.nextLine();
				System.out.print("Digite sua função: ");
				String funcao = leia.nextLine();
				System.out.print("Digite seu setor: ");
				String setor = leia.nextLine();
				System.out.print("Informe seu local de trabalho: ");
				String localTrabalho = leia.nextLine();
				System.out.print("Informe seu salário: ");
				Double salario = leia.nextDouble();
				Funcionarios func = new Funcionarios(nome, funcao, setor, localTrabalho, salario);

				System.out.println("\n");
				System.out.println("\n");

				func.imprimeCartao(func);
				break;

			case 2:
				leia.nextLine();
				System.out.print("Digite seu nome: ");
				String nome2 = leia.nextLine();
				System.out.print("Digite sua idade: ");
				String idade = leia.nextLine();
				System.out.print("Digite seu CPF (Opcional): ");
				String cpf = leia.nextLine();	

				System.out.println("\n1 - Buscar sua consulta ja marcada");
				System.out.println("\n2 - Se deseja cancelar uma consulta já marcada");
				System.out.println("\n3 - Marcar consulta com a especialidade médica Pediatra");
				System.out.println("\n4 - Marcar consulta com a especialidade médica Clínico Geral");
				System.out.println("\n5 - Marcar consulta com a especialidade médica Geriatra");
				System.out.println("\n6 - Marcar consulta com a especialidade médica Dentista");
				System.out.println("\n7 - SAIR");
				System.out.println("\nDigite sua opção: ");
				op = leia.nextInt();

				if (op == 1) {
					System.out.println("\nSua consulta está agendada para o próximo dia útil. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHorários de distribuição de fichas: 07h às 09h - manhã | 13h às 15h - tarde\n");
				} else if (op == 2) {
					System.out.println("\nSua consulta acaba de ser cancelada!!!!\n");
				} else if (op == 3) {
					System.out.println("\nSua consulta com o(a) Pediatra foi agendada para o próximo dia útil. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHorários de distribuição de fichas: 07h às 09h - manhã | 13h às 15h - tarde\n");
				} else if (op == 4) {
					System.out.println("\n2Sua consulta com o Clínico Geral foi agendada para o próximo dia útil. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHorários de distribuição de fichas: 07h às 09h - manhã | 13h às 15h - tarde\n");
				} else if (op == 5) {
					System.out.println("\nSua consulta com a Geriátra foi agendada para o próximo dia útil. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHorários de distribuição de fichas: 07h às 09h - manhã | 13h às 15h - tarde\n");
				} else if (op == 6) {
					System.out.println("\nSua consulta com a Dentista foi agendada para o próximo dia útil. "
							+ "\nAtendimento por ordem de chegada! "
							+ "\nHorários de distribuição de fichas: 07h às 09h - manhã | 13h às 15h - tarde");
				} else if (op == 7) {
					System.out.println("\nSaindo do sistema");
				}
				break;
			default:
				if (op < 0 || op > 3) {
					System.out.println("\nOpção inválida, tente novamente!");
				}
			}

		} while (op != 0);
		
		leia.close();

	}

}
