package br.unifor.exercicios.lista03;

public class TestaOperario {

	public static void main(String[] args) {
		Operario operario = new Operario();
		operario.setNome("Andre");
		operario.setSalarioBase(2500.0);
		operario.setImposto(500.0);
		operario.setValorProducao(10000.0);
		
		System.out.println("Salário: " + operario.calcularSalario());
	}
}
