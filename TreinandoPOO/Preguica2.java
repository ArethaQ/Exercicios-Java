package treinandoPOO;

public class Preguica2 extends Animal2{

	public Preguica2()
	{
		super("Tipo animal: Preguiça");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguiça: "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom que a preguiça emite: "+somAnimal);
	}
	
	public void subirArvore()
	{
		System.out.println("\nUma das características da preguiça é subir em árvores!!!");
	}

}
