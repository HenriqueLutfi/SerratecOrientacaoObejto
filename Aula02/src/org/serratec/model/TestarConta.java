package org.serratec.model;

public class TestarConta {

	public static void main(String[] args) {
		conta conta1 = new conta();
		conta1.numero=123;
		conta1.titular="fulano";
		conta1.saldo = 1000.;
		conta1.depositar(100);
		if(conta1.saque(100)) {
			System.out.println("saque efetuado comsucesso ");
			System.out.println("seu saldo atual eh de: "+ conta1.saldo);
		}else {
			System.out.println("saldo insufieicnte");
		}
	}

}
