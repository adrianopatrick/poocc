package br.unifor.exercicios.lista01;

import javax.swing.JOptionPane;

/**
 * valorDespesa(entrada) -> valorDespesa * 0.1(processamento) -> comissao(saida)
 */
public class Questao4 {

	public double calculaComissao(double valorDespesa) {
		double comissao = 0.0;

		comissao = valorDespesa * 0.1;

		return comissao;
	}
	
	public static void main(String[] args) {
		double valorDespesa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da despesa: "));

		Questao4 q4 = new Questao4();
		double comissao = q4.calculaComissao(valorDespesa);

		JOptionPane.showMessageDialog(null, "Comissão do Garçon: " + comissao);
	}
}
