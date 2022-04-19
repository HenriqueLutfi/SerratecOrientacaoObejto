package Exercicio1Animal;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;



	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	public String getMarcaFerradura() {
		return marcaFerradura;
	}
	
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return super.emitirSom() + "hiiin hi";
	}
	
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		super.amamentar();
	}

	@Override
	public void trocarFerradura() {
		System.out.println("trocando: plec plec plec");

	}

	@Override
	public void viajar() {
		System.out.println("pocoto pocoto pocoto");

	}

}
