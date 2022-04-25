package ExemploPessoa;

import java.util.ArrayList;
import java.util.List;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("carlos", "aah@.com", 55);
		Pessoa p2 = new Pessoa("carla", "dadad@.com", 39);
		Pessoa p3 = new Pessoa("faf", "eeqe@.com", 5);
		Cliente c1 = new Cliente("marcio");
		//somente da classe pessoa
		List<Pessoa> pessoas = new ArrayList<Pessoa>() ;
		//List pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		//pessoas.add(c1);
	
		for(Object object: pessoas) {
			System.out.println(object);
		}
	}
}
