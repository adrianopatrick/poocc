package br.unifor.exercicios.lista01;

public enum Cargo {
	ALTO_ESCALAO(4), DIRETORIA(1), GERENCIA(2), OPERACIONAL(3);
	
	private Integer codigo;
	
	private Cargo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo(){
		
		return this.codigo;
	}
}
