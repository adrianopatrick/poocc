package br.unifor.exercicios.heranca;

public class Main {

	public static void main(String[] args) {
		FiguraGeometrica figura = new Circulo(8d);
		figura.imprimir();
		
		System.out.println();
		
		Quadrado quadrado = new Quadrado(8d);
		quadrado.imprimir();
		quadrado.imprimirLado();
	}
}
