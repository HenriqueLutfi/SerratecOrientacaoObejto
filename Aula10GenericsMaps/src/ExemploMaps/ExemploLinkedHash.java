package ExemploMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHash {

	public static void main(String[] args) {
		//ordena na ordem q foi adicionado
		LinkedHashMap<Integer, String> cursos = new LinkedHashMap<>();
		cursos.put(1, "PHP");
		cursos.put(2, "API REST");
		cursos.put(3, "REDES");
		
		for (Map.Entry<Integer, String> dadosCurso : cursos.entrySet()) {
			System.out.println(dadosCurso);
		}
	}

}
