package br.unifor.exercicios.lista03;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado();
		empregado.setNome("João");
		empregado.setSalarioBase(2500.00);
		empregado.setImposto(500.0);

		System.out.println("Salário líquido: " + empregado.calcularSalario());
	}
}
