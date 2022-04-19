package ExercicioLutaTurbinado;

public class CategoriaLuta {
	private int codigo;
	private String nomeCategoria;
	private double pesoMinino;
	private double pesoMaximo;



	public CategoriaLuta(int codigo, String nomeCategoria, double pesoMinino, double pesoMaximo) {
		super();
		this.codigo = codigo;
		this.nomeCategoria = nomeCategoria;
		this.pesoMinino = pesoMinino;
		this.pesoMaximo = pesoMaximo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public double getPesoMinino() {
		return pesoMinino;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	@Override
	public String toString() {
		return nomeCategoria;
	}
	
	

}
