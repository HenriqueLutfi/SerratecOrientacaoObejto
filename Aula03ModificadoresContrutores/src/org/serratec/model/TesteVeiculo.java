package org.serratec.model;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		char resposta = 's';
		Scanner sc = new Scanner(System.in);
		do {
			Veiculo v1 = new Veiculo();
			System.out.println("digite placa");
			v1.placa = sc.next();
			System.out.println("digite o tipo de combustivel");
			v1.tipoCombustivel = sc.next();
			System.out.println("digite o valor");
			v1.valor = sc.nextDouble();
			System.out.println("o valor do IPVA 2022 R$" + v1.calcularIPVA());
			System.out.println("Deseja continuar (S/s)");
			resposta = sc.next().charAt(0);//nao tem metodo para usar character ai coloca esse index 0
		} while(resposta == 's' || resposta == 's');
		sc.close();
	}

}
