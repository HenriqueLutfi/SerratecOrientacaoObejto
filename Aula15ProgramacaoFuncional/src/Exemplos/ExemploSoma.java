package Exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploSoma {
	public static void main(String[] args) {
		/*Calculo calculo = new Calculo() {

			@Override
			public int operacao(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
	*/
		//a mesma coisa mas com lambda
		/*Calculo calculo = (a,b)	->a+b;
		System.out.println("oresultado da some e: " + calculo.operacao(10, 30));
	*/
	
		List<String> lista = new ArrayList<>();
		lista.add("ccelular");
		lista.add("tv");
		lista.add("pc");
		//lambda
		lista.forEach(a-> System.out.println(a));
		System.out.println();
		//reference
		lista.forEach(System.out::println);
	}
}
