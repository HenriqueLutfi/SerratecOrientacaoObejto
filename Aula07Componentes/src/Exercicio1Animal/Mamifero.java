package Exercicio1Animal;

import java.time.LocalDate;

public abstract class Mamifero extends Animal{
	protected String raca;


	
	public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}

	public void amamentar() {
		System.out.println("glub glub glub");
	}

	public String getRaca() {
		return raca;
	}
	
	
}
