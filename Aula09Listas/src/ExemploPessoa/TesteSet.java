package ExemploPessoa;

import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
	public static void main(String[] args) {
		//aleatorio
		//Set<String> lista = new HashSet<>();
		//ordena e nao permite coisa igual
		Set<String> lista = new TreeSet<>();
		lista.add("tv");
		lista.add("celular");
		lista.add("kindle");
		lista.add("som");
		System.out.println(lista);
	}
}
