package ExercicioOficina;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return  nome;
	}

	public String getNome() {
		return nome;
	}

}
