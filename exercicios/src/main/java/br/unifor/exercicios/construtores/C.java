package br.unifor.exercicios.construtores;

public class C extends B {

	private String nome;
	private Integer idade;
	
	public C(String nome) {
		super(nome);
		this.nome = nome;
		System.out.println("construtor C(string)");
	}
	
	public C(String nome, Integer idade){
		this(nome);
		this.idade = idade;
		System.out.println("construtor c(string,integer)");
	}
}
