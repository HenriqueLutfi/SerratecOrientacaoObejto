package Exercicio1Animal;

import java.time.LocalDate;

public abstract class ave extends Animal {
	protected String cor;

	public ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public String voar() {
		return null;
	}

}
