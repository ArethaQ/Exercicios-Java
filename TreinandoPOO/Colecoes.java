package treinandoPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criar o meu list
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2); //add irá adicionar um elemento ao meu ArrayList
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(6);
		minhaLista.add(1);
		minhaLista.add(3);
		
		for(Integer listaElementos: minhaLista) //o for é usado aqui pra percorrer a lista inteira
		{
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da minha lista...");
		System.out.println();
		minhaLista.remove(0); //serve pra remover um indice da lista da array
		for(Integer listaElementos: minhaLista)
		{
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0); //abaixo terá outra opção de como fazer isso
		System.out.println("\nO primeiro elemento da minha lista é: "+primeiroElemento);;
				
		for(int i=0;i<minhaLista.size();i++) //aqui é apenas outra forma de fazer a mesma coisa feita cima
		{
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		System.out.println("\nDepois de ordenado fica assim: ");
		System.out.println(minhaLista);
		
		System.out.println(); //O System.out.println(); vazio asssim, serve para apagar o cache
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(3);	
		meuSet.add(8);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(8);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
		
	}

}
