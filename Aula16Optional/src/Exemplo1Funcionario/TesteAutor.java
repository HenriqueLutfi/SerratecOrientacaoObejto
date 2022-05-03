package Exemplo1Funcionario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteAutor {

	public static void main(String[] args) {
		Autor a1 = new Autor("sandro", "2222222");
		Autor a2 = new Autor("casd", "13123123");

		List<Autor> autores = Arrays.asList(a1, a2);

		Consumer<Autor> exemploLambda = a -> a.imprimir();
		autores.forEach(exemploLambda);
		System.out.println();
		Consumer<Autor> exemploMethodReference = Autor::imprimir;
		autores.forEach(exemploMethodReference);
		System.out.println();
		autores.forEach(Autor::imprimir);

	}

}
