package model;

import exception.SaldoInsuficienteException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta {
	protected Cliente cliente;
	protected int agencia;
	public int numero;
	protected double saldo = 0;

	// Construtor manual preservado
	public Conta(Cliente cliente, int agencia, int numero) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
	}

	@Override
	public void depositar(double valor) {
		if (valor <= 0)
			throw new IllegalArgumentException("Valor deve ser positivo");
		saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		if (valor > saldo)
			throw new SaldoInsuficienteException("Saldo insuficiente: R$ " + saldo);
		saldo -= valor;
	}

	@Override
	public void transferir(double valor, IConta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("CPF: %s", cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", cliente.getAgencia()));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}

	@Override
	public abstract void imprimirExtrato();
}

