package ExercicioLuta;

public class CategoriaLuta {
	private int codigo;
	private String nomeCategoria;

	public CategoriaLuta(int codigo, String nomeCategoria) {
		super();
		this.codigo = codigo;
		this.nomeCategoria = nomeCategoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

}
