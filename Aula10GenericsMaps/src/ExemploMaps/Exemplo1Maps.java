package ExemploMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo1Maps {

	public static void main(String[] args) {
		/*TreeMap 
		Mantém ordem crescente 
		Não pode conter chave nula 
		Não permite valores nulos 
		A classificação é mais lenta 
		
		HashMap
		Não mantém 
		Pode conter uma chave nula
		Permite valores nulos
		A manipulação dos elementos é mais rápida*/
		
		HashMap<String, String> mapaEstados = new HashMap<>();
		mapaEstados.put("RJ", "rio de janeiro");
		mapaEstados.put("SP", "sao Paulo");
		mapaEstados.put("MG", "minas Gerais");
		
		for (String sigla : mapaEstados.keySet()) {
			System.out.println(sigla);
		}

		for (String nome : mapaEstados.values()) {
			System.out.println(nome);
		}

		for (Map.Entry<String, String> dados : mapaEstados.entrySet()) {
			System.out.println(dados.getKey() + "----" + dados.getValue());
		}

		TreeMap<String,String> mapasOrdenados = new TreeMap<>(mapaEstados);
		System.out.println("----------");
		System.out.println(mapasOrdenados);
		System.out.println(mapasOrdenados.descendingMap());
	}

}
