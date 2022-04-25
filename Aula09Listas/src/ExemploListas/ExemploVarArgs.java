package ExemploListas;

import java.util.Iterator;

public class ExemploVarArgs {

	public static void main(String[] args) {
		int total = calculaSoma(2,10,10);
		System.out.println("total: " + total);

	}
	
	private static int calculaSoma( int numero,int... numeros) {
		int soma = 0;
		for (int valor : numeros) {
			soma += valor;
		}
		return soma*numero;
	}

}
