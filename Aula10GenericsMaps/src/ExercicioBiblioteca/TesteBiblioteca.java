package ExercicioBiblioteca;

import java.util.Collections;
import java.util.List;

public class TesteBiblioteca {
	public static void main(String[] args) {
		Livro livro1 = new Livro("jose", "zzzz", 50.2);
		Livro livro2 = new Livro("dadad", "aaaa", 75.2);
		Biblioteca biblioteca = new Biblioteca("carlos");

		biblioteca.adicionar(livro1);
		biblioteca.adicionar(livro2);
		Collections.sort(biblioteca.getLista());
		System.out.println(biblioteca.toString());
		System.out.println(biblioteca.calcularTotalLivros());
	}
}
