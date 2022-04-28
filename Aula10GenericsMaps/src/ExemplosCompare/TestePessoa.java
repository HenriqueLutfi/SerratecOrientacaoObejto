package ExemplosCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Aaaa", "13213212", 45);
		Pessoa p2 = new Pessoa("ddddd", "86786", 35);
		Pessoa p3 = new Pessoa("fffff", "5345345", 15);

		List<Pessoa> pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
		List<String>cores	= new ArrayList<>();
		cores.add("verde");
		cores.add("amarelo");
		cores.add("roxo");
		Collections.sort(cores);
		System.out.println(cores);
	}

}
