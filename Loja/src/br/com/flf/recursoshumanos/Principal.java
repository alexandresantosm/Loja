package br.com.flf.recursoshumanos;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf(12345678);
		funcionario.setSalario(2500);
		funcionario.setDesconto(150);
		
		System.out.println("PRATICA 4");
		System.out.printf("Salario de funcionario: %.2f\n", funcionario.calcularSalario());
		
		
		Vendedor vendedor = new Vendedor(12345678, 600, 0, 25.9);
		System.out.printf("Salario de vendedor: %.2f\n", vendedor.calcularSalario());
		
		System.out.println("\nPRATICA 5");
		
		Funcionario f1;
		f1 = new Vendedor(12458703, 1500, 236.78, 50.43);
		System.out.printf("Salario do vendedor: %.2f\n", f1.calcularSalario());
		
		f1 = new Diarista(45012657, 0, 65.17, 15.21, 52);
		System.out.printf("Salario da diarista: %.2f\n", f1.calcularSalario());
	}
}