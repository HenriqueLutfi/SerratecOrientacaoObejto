package ExemploEmpresa;

public class Pessoa {
	private String nome;
	private String email;
	private Setor setor;
	private EstadoCivil estadoCivil;
	private Escolaridade escolaridade;

	enum Escolaridade {
		GRADUACAO('G'), MEDIO('M'), FUNDAMENTAL('F');

		private char escolaridade;

		Escolaridade(char escolaridade) {
			this.escolaridade = escolaridade;
		}
	}

	public Pessoa(String nome, String email, Setor setor, EstadoCivil estadoCivil, Escolaridade escolaridade) {
		super();
		this.nome = nome;
		this.email = email;
		this.setor = setor;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Setor getSetor() {
		return setor;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

}
