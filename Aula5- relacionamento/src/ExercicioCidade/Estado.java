package ExercicioCidade;

public class Estado {
	protected String nomeEstado;
	protected String sigla;

	public Estado(String nomeEstado, String sigla) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}

	@Override
	public String toString() {
		return nomeEstado + " " +sigla ;
	}
	
}
