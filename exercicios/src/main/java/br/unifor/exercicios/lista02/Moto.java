package br.unifor.exercicios.lista02;

/**
 * Lista 02 Questões 09, 10, 11, 12, 13, 14, 15 e 16
 */
public class Moto {

	private String marca;
	private String modelo;
	private String cor;
	private Marcha marcha;
	private Boolean ligada;

	public Moto(String marca, String modelo, String cor, Marcha marcha, Boolean ligada) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
		this.ligada = ligada;
	}

	public void imprimir() {
		System.out.println(this.toString());
	}
	
	public void ligar(){
		this.ligada = true;
	}
	
	public void desligar(){
		this.ligada = false;
	}

	public void marchaAcima() {
		if (!Marcha.QUARTA.equals(this.marcha)) {
			this.marcha = Marcha.getMarcha(this.marcha.ordinal() + 1);
		}
	}

	public void marchaAbaixo() {
		if (!Marcha.NEUTRO.equals(this.marcha)) {
			this.marcha = Marcha.getMarcha(this.marcha.ordinal() - 1);
		}
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", marcha=" + marcha + ", ligada="
				+ ligada + "]";
	}
}
