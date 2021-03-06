package ExercicioLutaTurbinado;

public class NomeLutador {
	private String nome;
	private CategoriaLuta categoriaLuta;
	private int idade;
	private double peso;

	public NomeLutador(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		// this.categoriaLuta = categoriaLuta;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public CategoriaLuta getCategoriaLuta() {
		return categoriaLuta;
	}

	public void setCategoriaLuta(CategoriaLuta categoriaLuta) {
		this.categoriaLuta = categoriaLuta;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	

	@Override
	public String toString() {
		return  nome + " categoria " + categoriaLuta + " idade: " + idade + " peso:" + peso;
	}

	public void VerificaCategoria(CategoriaLuta cat1[]) {
		for (int i = 0; i < cat1.length; i++) {
			if (peso >= cat1[i].getPesoMinino() && peso <= cat1[i].getPesoMaximo()) {
				categoriaLuta = cat1[i];
			}
		}
	}

}
