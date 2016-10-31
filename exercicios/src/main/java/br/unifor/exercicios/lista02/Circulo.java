package br.unifor.exercicios.lista02;

/**
 * Lista 02
 * Questões 07 e 08
 * */
public class Circulo {

	private Double raio;
	private Double area;
	private Double perimetro;
	private static final Double PI = 3.141516;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double calcularArea(){
		return this.raio * this.raio * PI;
	}
	
	public Double calcularPerimetro(){
		return 2 * PI * this.raio;
	}
	
	public void imprimir(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
	
}
