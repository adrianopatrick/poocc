package br.unifor.exercicios.lista03;

/** Exercício 6 - Agregação */
public class Reta {

	private Ponto pontoInicial;
	private Ponto pontoFinal;

	public Reta(int x1, int y1, int x2, int y2) {
		this.pontoInicial = new Ponto(x1, y1);
		this.pontoFinal = new Ponto(x2, y2);
	}

	public void exibe() {
		System.out.println("Ponto Inicial = (" + this.pontoInicial.exibe() + ")");
		System.out.println("Ponto Final = (" + this.pontoFinal.exibe() + ")");
	}
	
	public Double tamanhoReta() {
		// raiz_quadrada[(x2 - x1) ^ 2 + (y2 - y1) ^ 2)
		return Math.sqrt(Math.pow(pontoFinal.getX() - pontoInicial.getX(), 2) + 
				Math.pow(pontoFinal.getY() - pontoInicial.getY(), 2));
	}
}
