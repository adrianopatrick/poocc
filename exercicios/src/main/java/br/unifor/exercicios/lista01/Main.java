package br.unifor.exercicios.lista01;

import br.unifor.exercicios.aula07.Agencia;
import br.unifor.exercicios.aula07.Cliente;
import br.unifor.exercicios.aula07.Conta;
import br.unifor.exercicios.aula07.TipoConta;

public class Main {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("Andre Pinheiro");
		cli.setCpf("11111");
		cli.setIdade(30);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria Aparecida");
		cliente.setCpf("22222");
		cliente.setIdade(32);
		
		Agencia agencia = new Agencia();
		agencia.setNome("BB - Pontes Vieira");
		agencia.setNumero("2913-2");
		
		Conta conta = new Conta();
		conta.setAgencia(agencia);
		conta.setCliente(cli);
		conta.setNumero("3178-9");
		conta.setSaldo(1200.0);
		conta.setTipo(TipoConta.CORRENTE);
		
		Conta conta1 = new Conta();
		conta1.setAgencia(agencia);
		conta1.setCliente(cliente);
		conta1.setNumero("2178-9");
		conta1.setSaldo(1200.0);
		conta1.setTipo(TipoConta.POUPANCA);
		
		agencia.adicionarConta(conta);
		agencia.adicionarConta(conta1);
		
		for(int i = 0; i < agencia.getContas().size(); i++) {
			System.out.println(agencia.getContas().get(i).getCliente().getNome());
		}
	}
}
