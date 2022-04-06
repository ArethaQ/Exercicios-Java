package Familia51;
/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido 
e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
import java.util.Scanner;

public class atividadeMatriz04dia050422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float [][] Matriz1 = new float [2][2];
		float [][] Matriz2 = new float [2][2];
		float [][] Matriz3 = new float [2][2];
		int i,j,op;
		float numero;
			Scanner leia = new Scanner(System.in);
			
			for(i=0;i<2;i++) 
			{
				for(j=0;j<2;j++) 
				{
					System.out.println("\nEntre com o valor da matriz 1: ");
					Matriz1[i][j] = leia.nextFloat();
					System.out.println("\nEntre com o valor da matriz 2: ");
					Matriz2[i][j] = leia.nextFloat();
				}
			}
		
		do {
			System.out.println("\nEscolha uma opção: " );
			System.out.println("\n1- Somar as duas matrizes.");
			System.out.println("\n2- Subtrair a primeira matriz da segunda.");
			System.out.println("\n3- Adicionar uma constante as duas matrizes.");
			System.out.println("\n4- Imprimir as matrizes.");
			System.out.println("\n0 - Sair do sistema.");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						Matriz3[i][j] = Matriz1[i][j] + Matriz2[i][j];
						System.out.println("\nsoma das matrizes "+Matriz3[i][j] );
					}				
				}
				
				break;
				
				
			case 2:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						Matriz3[i][j] = Matriz2[i][j] - Matriz1[i][j];
						System.out.println("\nSubtração das matrizes "+Matriz3[i][j] );
					}				
			}
				
				break;
				
			case 3:
				
				System.out.println("\nInforme o valor da constante: ");
				numero = leia.nextFloat();
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						Matriz1[i][j] += numero;
						Matriz2[i][j] += numero;
						System.out.println("\nmatriz1 " + Matriz1[i][j]);
						System.out.println("\nmatriz2 " + Matriz2[i][j]);
						}
					}
				break;
				
			case 4:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						
						System.out.println("\nmatriz1 " + Matriz1[i][j]);
						System.out.println("\nmatriz2 " + Matriz2[i][j]);
						}
					}
				
				break;
			default:
				if(op <0 || op>4) {
					
					System.out.println("\nOpção inválida");
					
				}else if(op == 0) {
					System.out.println("\nSaindo do sistema");
					
				}else {
					System.out.println("\nVoltando ao menu");
				}
									
			}			
			
		}while(op!=0);
		
	}

}
