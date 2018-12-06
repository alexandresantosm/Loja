package br.com.flf.recursoshumanos;

public class Vendedor extends Funcionario{
	
	private double comissao;
	
	public Vendedor() {
		
	}

	public Vendedor(long cpf, double salario, double desconto, double comissao) {
		super(cpf, salario, desconto);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return (salario + this.comissao) - desconto;
	}
}
