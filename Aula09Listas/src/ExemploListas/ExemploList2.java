package ExemploListas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploList2 {
	public static void main(String[] args) {
		//somente alteracao dos dados
		List lista = Arrays.asList("tv","celular", "kindle");
		
		if (lista.isEmpty()) {
			System.out.println("lista vazia");
		}else {
			lista.set(1,"iphone");
			System.out.println(lista.get(1));
			System.out.println("o elemento da posicao e kindle? " + 
			(lista.contains("kindle")? "sim":"nao"));
		}
		Collections.sort(lista);
		System.out.println(lista);
	}
}
