package br.unifor.exercicios.heranca;

public class Circulo extends FiguraGeometrica {

	private Double raio;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public Double calcularArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public Double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
	
}
