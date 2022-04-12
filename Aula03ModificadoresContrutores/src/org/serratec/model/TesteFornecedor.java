package org.serratec.model;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("12838123", "xpto ltda", "123123123");
		Fornecedor f2 = new Fornecedor("312312", "xpto ltda", "1233333123123");

		//System.out.println("o numero total de fornecedores eh: " + f2.getContador());
		System.out.println("o numero total de fornecedores eh: " + Fornecedor.getContador());
		
	}
}
