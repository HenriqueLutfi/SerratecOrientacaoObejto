package org.serratec.model;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setCodigoPessoa(1);
		p1.setNome("fulano");
		p1.setAltura(1.7);
		p1.setPeso(60);
		System.out.println(p1.getNome());
		System.out.println(p1.resultado());
	}
}
