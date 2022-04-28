package ExemploMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo1Maps {

	public static void main(String[] args) {
		/*TreeMap 
		Mant�m ordem crescente 
		N�o pode conter chave nula 
		N�o permite valores nulos 
		A classifica��o � mais lenta 
		
		HashMap
		N�o mant�m 
		Pode conter uma chave nula
		Permite valores nulos
		A manipula��o dos elementos � mais r�pida*/
		
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
