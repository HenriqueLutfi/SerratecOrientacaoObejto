package ExemploPolicial;

public class Policial {
	protected String cpf;
	protected String nome;


	protected double salario;
	// constante
	private final String lotacao;
	private static int totalPoliciais;

	public Policial(String cpf, String nome, double salario, String lotacao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.lotacao = lotacao;
		totalPoliciais++;
	}

	public String getLotacao() {
		return lotacao;
	}

	public static int getTotalPoliciais() {
		return totalPoliciais;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	// nao pode ser sobrescrito (override)
	public final String mostrarInformacoes() {
		return nome + "-" + cpf + "-" + salario;
	}
}
