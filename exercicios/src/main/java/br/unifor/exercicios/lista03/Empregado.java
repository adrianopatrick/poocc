package br.unifor.exercicios.lista03;

public class Empregado extends Pessoa {
	
	private Integer codigoSetor;
	private Double salarioBase;
	private Double imposto;
	
	public Integer getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Double getImposto() {
		return imposto;
	}
	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double calcularSalario(){
		return this.salarioBase - this.imposto;
	}

}
