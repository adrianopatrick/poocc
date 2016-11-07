package br.unifor.exercicios.heranca;

public class Quadrado extends FiguraGeometrica {

	private Double lado;

	public Quadrado(Double lado) {
		this.lado = lado;
	}

	public void imprimirLado() {
		System.out.println("Lado do quadro vale: " + this.lado);
	}

	@Override
	public Double calcularArea() {
		return lado * lado;
	}

	@Override
	public Double calcularPerimetro() {
		return 4 * lado;
	}

}
