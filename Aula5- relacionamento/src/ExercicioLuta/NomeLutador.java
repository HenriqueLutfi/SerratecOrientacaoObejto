package ExercicioLuta;

public class NomeLutador {
	private String nome;
	private CategoriaLuta categoriaLuta;
	private int idade;
	private double peso;

	public NomeLutador(String nome, CategoriaLuta categoriaLuta, int idade, double peso) {
		super();
		this.nome = nome;
		this.categoriaLuta = categoriaLuta;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public CategoriaLuta getCategoriaLuta() {
		return categoriaLuta;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

}
