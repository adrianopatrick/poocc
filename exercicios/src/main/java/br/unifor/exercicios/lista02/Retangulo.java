package br.unifor.exercicios.lista02;

/**
 * Lista 02
 * Questões 05 e 06
 * */
public class Retangulo {

	private Double comprimento;
	private Double largura;
	private Double area;
	private Double perimetro;

	public Retangulo(Double comprimento, Double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public Double calcularArea(){
		return this.comprimento * this.largura;
	}
	
	public Double calcularPerimetro(){
		return 2 * this.largura + 2 * this.comprimento;
	}
	
	public void imprimir(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", largura=" + largura + ", area=" + area + ", perimetro="
				+ perimetro + "]";
	}
	
}
