package br.com.flf.produto;

public abstract class Produto {
	
	private double preco;
	private int quantidade;
	private long codigoDeBarra;
	
	public abstract double precoVenda(double preco, double lucro);
}
