package br.unifor.exercicios.lista02;

public class Quadrado {

	private double lado;
	private double area;
	private double perimetro;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
		this.calcularArea();
		this.calcularPerimetro();
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void imprimir() {
		System.out.println(this.toString());
	}

	public void calcularArea() {
		this.area = this.lado * this.lado;
	}

	public void calcularPerimetro() {
		this.perimetro = 4 * this.lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", area=" + area + ", perimetro=" + perimetro + "]";
	}

}
