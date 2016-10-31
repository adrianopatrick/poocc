package br.unifor.exercicios.lista02;

/**
 * Lista 02
 * Questões 03 e 04
 * */
public class Quadrado {
	
	private Double lado;
	private Double area;
	private Double perimetro;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}

	public Double calcularArea(){
		return this.lado * this.lado;
	}
	
	public Double calcularPerimetro(){
		return 4 * this.lado;
	}
	
	public void imprimir(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", area=" + area + ", perimetro=" + perimetro + "]";
	}

}
