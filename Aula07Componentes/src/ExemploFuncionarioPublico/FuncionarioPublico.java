package ExemploFuncionarioPublico;

public class FuncionarioPublico {
	private String nome;
	private String cargo;
	private final int ANO_CONCURSO;

	public FuncionarioPublico(String nome, String cargo, int ANO_CONCURSO) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.ANO_CONCURSO = ANO_CONCURSO;
	}

	@Override
	public String toString() {
		return "FuncionarioPublico [nome=" + nome + ", cargo=" + cargo + ", ANO_CONCURSO=" + ANO_CONCURSO + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public int getANO_CONCURSO() {
		return ANO_CONCURSO;
	}

}
