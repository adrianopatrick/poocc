package br.unifor.exercicios.lista02;

public enum Marcha {

	NEUTRO, PRIMEIRA, SEGUNDA, TERCEIRA, QUARTA;
	
	public static Marcha getMarcha(int ordinal){
		for (Marcha marcha : values()) {
			if(marcha.ordinal() == ordinal){
				return marcha;
			}
		}
		return null;
	}
}
