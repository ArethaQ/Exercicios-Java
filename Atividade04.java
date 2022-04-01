package Familia51;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero;
		double res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor do número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0)
		{
			res = Math.sqrt(numero);
		}
		else
		{
			res = Math.pow(numero,2);
		}
		
		System.out.println("\nResultado: "+res);

	}

}
