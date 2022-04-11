package treinandoPOO;

public class Cachorro2 extends Animal2 {

	public Cachorro2()
	{
		super("Tipo animal: Cachorro");
		
	}
	
	            //sobreescrita 
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom que seu cachorro emite: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nUma das características do cachorro é correr!!!");
	}

}
