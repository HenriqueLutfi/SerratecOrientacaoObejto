package Salarios;

public abstract class Funcionario {
	protected String nome;
	protected double salario;

	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

	@Override
	public String toString() {
		return "Funcionario " + nome + " salario " + salario;
	}

	// nao tem implementacao quem vai implementar sao os filhos
	public abstract void calcularAumentoSalario();

}
