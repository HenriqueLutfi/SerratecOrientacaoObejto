package Exercicio1;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Declara a variavel sc como classe Scanner
		int num1;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();// scanear o valor inteiro digitado e salvar na variavel num1
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "x" + num1 + " = " + i * num1);
		}
	}
}
