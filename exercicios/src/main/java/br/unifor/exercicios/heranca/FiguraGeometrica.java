package br.unifor.exercicios.heranca;

public abstract class FiguraGeometrica {
	
	public abstract Double calcularArea();
	
	public abstract Double calcularPerimetro();
	
	public void imprimir(){
		System.out.println("Área: " + this.calcularArea());
		System.out.println("Perímetro: " + this.calcularPerimetro());
	}
}
