package br.unifor.exercicios.lista01;

import javax.swing.JOptionPane;

public class Questao5 {
	
	public double calculaEmprestimo(double salario, Integer cargo) {
		double valorEmprestimo = 0.0;
		
		if(cargo.equals(Cargo.DIRETORIA.getCodigo())){
			valorEmprestimo = salario * 0.3;
		} else if(cargo.equals(Cargo.GERENCIA.getCodigo())) {
			valorEmprestimo = salario * 0.25;
		} else if(cargo.equals(Cargo.OPERACIONAL.getCodigo())){
			valorEmprestimo = salario * 0.20;
		}
		
		return valorEmprestimo;
	}

	public static void main(String[] args) {
		Integer cargo = Integer.parseInt(JOptionPane.
				showInputDialog("Escolha uma das opções \n"
				+ "1 - Diretoria \n"
				+ "2 - Gerencia \n"
				+ "3 - Operacional \n"
				+ "Digite uma das opções acima: "));
		Double salario = Double.parseDouble(JOptionPane.
				showInputDialog("Informe seu salário: "));
		Questao5 q5 = new Questao5();
		double valorEmprestimo = q5.calculaEmprestimo(salario, cargo);
		JOptionPane.showMessageDialog(null, "O valor do emprestimo será: "+valorEmprestimo);
	}
}
