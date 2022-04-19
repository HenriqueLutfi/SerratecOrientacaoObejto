package Exercicio1Animal;

import java.time.LocalDate;

public class Tucano extends ave {
	private double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String emitirSom() {
		return super.emitirSom()+ "gra gra gra";
	}
	
	@Override
	public String voar() {
		return "flap flap flap";
	}

}
