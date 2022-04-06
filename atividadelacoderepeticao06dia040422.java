package Familia51;
/*Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class atividadelacoderepeticao06dia040422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,somaMult3=0,contMult3=0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nentre com um número: ");
			numero = leia.nextInt();
			if(numero==0)
			{
				System.out.println("\nVocê digitou zero, vamos finalizar o sistema!!!");
			}
			else
			{
				if(numero%3==0)
				{
					somaMult3 +=numero;
					contMult3++;
				}
			}
		}
		while(numero!=0);
		media = somaMult3 / contMult3;
		System.out.printf("\nMédia dos números múltiplos de 3: %6.2f",media);

	}

}
