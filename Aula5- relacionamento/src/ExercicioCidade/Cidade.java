package ExercicioCidade;

import ExercicioAtleta.Atleta;

public class Cidade {
	protected String nomeCidade;
	protected Estado estado;

	public Cidade(String nomeCidade, Estado estado) {
		super();
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void inserirEstado(Estado estado) {
		this.estado=estado;
	}

	@Override
	public String toString() {
		return  nomeCidade + " " + estado;
	}

}
