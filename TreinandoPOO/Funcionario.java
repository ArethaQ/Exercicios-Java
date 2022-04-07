package treinandoPOO;

import java.text.NumberFormat;

public class Funcionario {

	//declarei os atributos da classe:
	private String nomeCompleto;
	private double salario;
	
	//declarei o método do construtor:
	public Funcionario(String nomeCompleto,double salario)
	{
		this.setNomeCompleto(nomeCompleto);
		this.setSalario(salario);
	}
	//declarei os métodos gerais:

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual / 100; // *= é utilizado p atribuir a uma var o valor desta var muktiplicado com o valor de um operando ,
	}
	
	public String formatarMoeda()  // tenho muitas duvidas nessa parte!!!
	{
	    NumberFormat nf = NumberFormat.getCurrencyInstance();
	    nf.setMinimumFractionDigits(2);
	    String formatoMoeda = nf.format(salario);
	    return formatoMoeda;
	}
	public void imprimir() 
	{
	    System.out.println("\nNome: "+nomeCompleto+"\t\tSalário: "+this.formatarMoeda());	
	}
}
