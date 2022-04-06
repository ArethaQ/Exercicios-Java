package Familia51;
/*4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
 * que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE) */

import java.util.Scanner;

public class atividadeLacoRepeticao04dia040402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int idade,genero,fp,contPc=0,contMn=0,contHa=0,contNbc=0,contPn40=0,contPc18=0,pessoas=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(pessoas<=2)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<1 || idade>130)
			{
				System.out.println("\nPor favor entre novamente com a sua idade: ");
				idade = leia.nextInt(); 
			}
			System.out.println("\nEntre com o seu genero: 1-Masculino 2-Feminino 3-Não binário");
			genero = leia.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("\nEntre novamente com o seu genero: 1-Masculino 2-Feminino 3-Não binário");
				genero = leia.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicológico: 1- Calme 2-Nervose 3- Agressive");
			fp = leia.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("\nEntre novamente com o seu fator psicológico: 1- Calme 2-Nervose 3- Agressive");
				fp = leia.nextInt();
			}
			
			if(fp==1)
			{
				contPc++;
			}
			
			if(genero==2 && fp==2)
			{
				contMn++;
			}
			
			if(genero==1 && fp==3)
			{
				contHa++;
			}
			
			if(genero==3 && fp==1)
			{
				contNbc++;
			}
			
			if(fp==2 && idade>40)
			{
				contPn40++;
			}
			
			if(fp==1 && idade<18)
			{
				contPc18++;
			}
			pessoas++;
		}
		
		System.out.println("\nPessoas calmas: "+contPc);
		System.out.println("\nMulheres nervosas: "+contMn);
		System.out.println("\nHomens agressivos: "+contHa);
		System.out.println("\nNão binário calmes: "+contNbc);
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+contPn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contPc18);

	}

}
