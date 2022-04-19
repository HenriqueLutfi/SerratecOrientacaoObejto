package Exercicio1Animal;

import java.time.LocalDate;

public abstract class Animal {
	protected String nome;
	protected LocalDate dataVacinacao;
	private static int qtdAnimal;

	public Animal(String nome, LocalDate dataVacinacao) {
		super();
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
		qtdAnimal++;
		
	}

	public static int getQtdAnimal() {
		return qtdAnimal;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataVacinacao() {
		return dataVacinacao;
	}
	
	public String emitirSom() {
		return "emitindo som: ";
	}
}
