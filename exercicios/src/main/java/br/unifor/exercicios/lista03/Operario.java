package br.unifor.exercicios.lista03;
/**Questoes: 05*/
public class Operario extends Empregado {
	
	private Double valorProducao;
	private Double comissao;
	
	public Double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(Double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public Double getComissao() {
		return this.valorProducao * 0.1;
	}
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double calcularSalario(){
		return super.calcularSalario() + this.getComissao();
	}

}
