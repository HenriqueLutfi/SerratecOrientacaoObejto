package org.serratec.model;

public class conta {
	String titular;
	double numero;
	double saldo;

	public void depositar(double valor) {
		// referencia o saldo da classe
		this.saldo += valor;
		System.out.println("seu saldo eh de: " + saldo);
	}

	public boolean saque(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
}
