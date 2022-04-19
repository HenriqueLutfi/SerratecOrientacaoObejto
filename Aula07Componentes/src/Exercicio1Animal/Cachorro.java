package Exercicio1Animal;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return super.emitirSom()+"au au au";
	}
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		super.amamentar();
	}
	@Override
	public boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}

}
