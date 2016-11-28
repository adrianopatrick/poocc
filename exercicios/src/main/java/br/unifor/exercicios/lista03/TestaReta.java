package br.unifor.exercicios.lista03;

/** Exercício 6 - Agregação */
public class TestaReta {

	public static void main(String[] args) {
		Reta reta = new Reta(2, 3, 5, 6);
		
		reta.exibe();
		System.out.println("Tamanho da reta: " + reta.tamanhoReta());
	}
}
