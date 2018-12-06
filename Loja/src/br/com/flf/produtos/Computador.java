package br.com.flf.produtos;

public class Computador extends Produto implements Autenticacao{

	@Override
	public double precoVenda(double preco, double lucro) {
		return preco + lucro;
	}

	@Override
	public boolean autenticaCodigo(long codigoBarra) {
		if (codigoDeBarra == codigoBarra) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Computador computador = new Computador();
		
		computador.setPreco(899.98);
		computador.setQuantidade(10);
		computador.setCodigoDeBarra(123456);
		
		System.out.println(computador.autenticaCodigo(123456));
		System.out.println(computador.precoVenda(545.63, 120.99));
	}
}
