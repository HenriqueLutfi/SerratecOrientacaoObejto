package ExercicioSalario;

import java.util.Scanner;

public class TesteSalario {

	public static void main(String[] args) {
		boolean finalizar=false;
		double valorVenda;
		int verificaVendedor;
		char verificaSaida;
		Fixo fixo = new Fixo("jao","12121",1000,0.10);
		Fixo fixo2 = new Fixo("maria","5456",100,0.5);
		Scanner sc = new Scanner(System.in);
		while(finalizar==false) {
			System.out.println("vendedores: \n"+"1 - "+fixo.getNome() + "\n2 - "+ fixo2.getNome());
			verificaVendedor = sc.nextInt();
			System.out.println("digite o valor da venda: ");
			valorVenda=sc.nextDouble();
			if (verificaVendedor==1) {
				fixo.calcularSalario(valorVenda);
			}else {
				fixo2.calcularSalario(valorVenda);
			}
			System.out.println("deseja encerrar o programa (s/n): ");
			verificaSaida=sc.next().charAt(0);// nao tem como ler somente um caracter entao le como string e ve o primeiro index
			if (verificaSaida=='s') {
				finalizar=true;
			}
		}
		sc.close();
		System.out.println("salarios \nnome: "+fixo.getNome() + "\nsalario bruto: R$"+ fixo.getSalarioBruto());
		System.out.println("nome: "+fixo2.getNome() + "\nsalario bruto: R$"+ fixo2.getSalarioBruto());
		System.out.println("total: R$"+(fixo.getSalarioBruto()+fixo2.getSalarioBruto()));
	}

}
