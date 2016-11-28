package br.unifor.exercicios.lista03;


/**Exercício 6 - Agregação*/
public class Ponto {
	
	private int x;
	private int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setaCoordenadas(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String exibe(){
		return x + ", " + y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
