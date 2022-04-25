package ExemploListas;

import java.util.List;

public class ExemploListOf {
	public static void main(String[] args) {
		List lista = List.of("tv","kindle",	"celular");
				/* Restrições
				 * lista.add("Som");
				 * lista.remove(0);
				 * lista.set(0,"Som");
				 */
		for(Object object : lista) {
			System.out.println(object);
		}
	}
}
