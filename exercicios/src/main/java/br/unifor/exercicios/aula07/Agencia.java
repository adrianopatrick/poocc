package br.unifor.exercicios.aula07;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

	private String nome;
	private String numero;
	private List<Conta> contas = new ArrayList<Conta>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void adicionarConta(Conta conta){
		this.contas.add(conta);
	}
	
	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", numero=" + numero + "]";
	}
	
}
