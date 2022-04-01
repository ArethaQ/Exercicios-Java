package Familia51;

import java.util.Scanner;

public class Atividade03dia010422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int idade;
		idade = 0;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite aqui a sua idade: ");
        idade = leia.nextInt();	
        
        if(idade>=10 && idade<=14)
        {
        	System.out.println("Você faz parte do grupo Infantil!");
        }
        else if(idade>=15 && idade<=17)
        {
        	System.out.println("Você faz parte do grupo Juvenil!");
        }
        else if(idade>=18 && idade<=25)
        {
        	System.out.println("Você faz parte do grupo Adultos!");
        }
        else
        {
        	System.out.println("Você não faz parte de nenhum dos nossos grupo!");
        }
        
	}

}
