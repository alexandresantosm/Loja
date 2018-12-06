package br.com.flf.produtos;

public abstract class Produto {
	
	double preco;
	int quantidade;
	long codigoDeBarra;
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public long getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(long codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

	public abstract double precoVenda(double preco, double lucro);
}
