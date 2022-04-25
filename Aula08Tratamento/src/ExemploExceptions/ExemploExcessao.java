package ExemploExceptions;

import java.util.Scanner;

public class ExemploExcessao {
	public static int divisao(int i, int j) throws ArithmeticException {
		/*
		if (j == 0) {
			throw new ArithmeticException("valor invalido");
		}*/

		return i / j;
	}

	public static void main(String[] args) {
		int a, b;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("digite o primeiro numero: ");
			a = sc.nextInt();
			System.out.println("digite o segundo numero: ");
			b = sc.nextInt();
			System.out.println("o resultado eh: " + divisao(a, b));
		} catch (ArithmeticException e) {
			System.out.println("erro na divisao por 0");
			System.out.println(e.getMessage());
		}

	}

}
