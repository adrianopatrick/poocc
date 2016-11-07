package br.unifor.exercicios.heranca;

public class Triangulo extends FiguraGeometrica {

	private Double base;
	private Double altura;

	public Double calcularArea() {
		return (base * altura) / 2;
	}

	public Double calcularPerimetro() {
		return null;
	}
}
