package br.unifor.exercicios.lista01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * valorDespesa(entrada) -> valorDespesa * 0.1(processamento) -> comissao(saida)
 * */
public class TestQuestao4 {

	@Test
	public void testComissao() {
		Questao4 q4 = new Questao4();
		double valorDespesa = 100.0;
		double comissao = q4.calculaComissao(valorDespesa);
		assertEquals(10.0, comissao, 0);
	}

}
