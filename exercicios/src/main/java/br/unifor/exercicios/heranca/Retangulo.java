package br.unifor.exercicios.heranca;

public class Retangulo extends FiguraGeometrica {

	private Double base;
	private Double altura;
	
	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
		return base * altura;
	}

	@Override
	public Double calcularPerimetro() {
		return 2 * base + 2 * altura;
	}

}
