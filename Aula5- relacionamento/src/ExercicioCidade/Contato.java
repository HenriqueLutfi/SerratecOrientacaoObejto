package ExercicioCidade;

import java.util.Arrays;

import ExercicioAtleta.Atleta;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;

	public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void inserirEndereco(Endereco endereco) {
		this.endereco=endereco;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\n" + endereco + "\n" + Arrays.toString(telefones);
	}
}
