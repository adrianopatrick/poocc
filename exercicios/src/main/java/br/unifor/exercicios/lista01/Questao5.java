package br.unifor.exercicios.lista01;

public class Questao5 {
	
	public double calculaEmprestimo(double salario, Integer cargo) {
		double valorEmprestimo = 0.0;
		
		if(cargo.equals(Cargo.DIRETORIA)){
			valorEmprestimo = salario * 0.3;
		} else if(cargo.equals(Cargo.GERENCIA)) {
			valorEmprestimo = salario * 0.25;
		} else if(cargo.equals(Cargo.OPERACIONAL)){
			valorEmprestimo = salario * 0.20;
		}
		
		return valorEmprestimo;
	}

}
