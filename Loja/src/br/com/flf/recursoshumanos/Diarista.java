package br.com.flf.recursoshumanos;

public class Diarista extends Funcionario{
	
	private double valorHora;
	private int qtdHora;
	
	public Diarista() {
		
	}

	public Diarista(long cpf, double salario, double desconto, double valorHora, int qtdHora) {
		super(cpf, salario, desconto);
		this.valorHora = valorHora;
		this.qtdHora = qtdHora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getQtdHora() {
		return qtdHora;
	}

	public void setQtdHora(int qtdHora) {
		this.qtdHora = qtdHora;
	}

	public double calcularSalario() {
		salario = (this.valorHora * this.qtdHora) - desconto;
		return salario;
	}
}
