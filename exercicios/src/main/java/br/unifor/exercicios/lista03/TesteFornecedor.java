package br.unifor.exercicios.lista03;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Industrias SA");
		fornecedor.setValorCredito(100.0);
		fornecedor.setValorDivida(50.0);
		
		System.out.println("Saldo atual:" + fornecedor.obterSaldo());
	}
}
