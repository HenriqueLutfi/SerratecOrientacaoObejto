package ExemploListas;

import java.util.Arrays;
import java.util.List;

public class ExemploDifArrayListOf {

	public static void main(String[] args) {
		String [] carros = {"gol",	"fusca","fiesta"};
		List listaCarros = Arrays.asList(carros);
		
		listaCarros.set(1, "fox");
		carros[2] = "ka";
		// mudar na lista muda no array
		for(Object object : listaCarros	) {
			System.out.println(object);
		}
		String[] cores = {"vermelho",	"azul","amarelo"};
		List lista = List.of(cores);
		cores[0]= "preto";
		System.out.println(lista);
		
	}

}
