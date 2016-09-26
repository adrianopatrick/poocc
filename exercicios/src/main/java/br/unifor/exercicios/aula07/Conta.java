package br.unifor.exercicios.aula07;

public class Conta {
	
	private String numero;
	private Double saldo;
	private Agencia agencia;
	private Cliente cliente;
	private TipoConta tipo;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", agencia=" + agencia + ", cliente=" + cliente
				+ ", tipo=" + tipo + "]";
	}
}
