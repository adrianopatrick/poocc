package br.unifor.exercicios.lista02;

/**
 * Lista 02
 * Questões 01 e 02
 * */
public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public void imprimir(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	
}
