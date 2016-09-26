package br.unifor.exercicios.aula07;

public class Cliente {

	//atributos do objeto
	private String nome;
	private String cpf;
	private Integer idade;
	
	
	/**métodos acessores - getts and settes*/
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getIdade(){
		return this.idade;
	}
	public void setIdade(Integer idade){
		if(idade > 0) {
			this.idade = idade;
		}
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	
}
