package Exercicio2;

import java.util.Scanner;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa[] p1 = new Pessoa[2];// declara variavel p1 como da classe Pessoa
		Scanner sc = new Scanner(System.in);
		double maiorPeso = 0, maiorAltura = 0, somaPeso = 0, somaAltura = 0, mediaPeso, mediaAltura;
		String nomeMaiorPeso = null, nomeMaiorAltura = null;
		int indexMaiorPeso, indexMaiorAltura;
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite seu nome: ");
			p1[i].nome = sc.next();// salva a String
			System.out.println("Digite sua altura: ");
			p1[i].altura = sc.nextDouble();// salva o numero double
			System.out.println("Digite seu peso: ");
			p1[i].peso = sc.nextDouble();
		}
		System.out.println(p1[0].nome);
		for (int i = 0; i < 2; i++) {
			if (p1[i].peso > maiorPeso) {
				maiorPeso = p1[i].peso;// salva o peso da pessoa coomo maior peso
				nomeMaiorPeso = p1[i].nome;// salva o nome da pessoa
				indexMaiorPeso = i;// salva o index que tem a pessoa de maior peso
			}
			if (p1[i].altura > maiorAltura) {
				maiorAltura = p1[i].altura;// salva o altura da pessoa coomo maior peso
				nomeMaiorAltura = p1[i].nome;// salva o nome da pessoa
				indexMaiorAltura = i;// salva o index que tem a pessoa de maior peso
			}
			somaPeso = somaPeso + p1[i].peso;
			somaAltura = somaAltura + p1[i].altura;
		}
		mediaPeso = somaPeso / 4;
		mediaAltura = somaAltura / 4;

		System.out.println("o nome do mais pesado: " + nomeMaiorPeso);
		System.out.println("o nome do mais alto: " + nomeMaiorAltura);
		System.out.println(mediaPeso);
	}
}
