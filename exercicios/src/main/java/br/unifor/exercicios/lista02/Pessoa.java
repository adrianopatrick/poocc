package br.unifor.exercicios.lista02;

/**
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
	
	public Pessoa(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void imprimir() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + this.nome + ", endereco=" + this.endereco + ", telefone=" + this.telefone + "]";
	}

}
