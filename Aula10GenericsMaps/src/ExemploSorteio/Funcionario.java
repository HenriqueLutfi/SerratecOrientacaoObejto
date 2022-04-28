package ExemploSorteio;

public class Funcionario {
	private String nome;
	private String cargo;
	private String departamento;
	public Funcionario(String nome, String cargo, String departamento) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.departamento = departamento;
	}
	public String getNome() {
		return nome;
	}
	public String getCargo() {
		return cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", departamento=" + departamento + "]";
	}
	
	
}
