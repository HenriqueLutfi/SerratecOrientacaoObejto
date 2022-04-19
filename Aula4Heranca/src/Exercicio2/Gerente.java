package Exercicio2;

public class Gerente extends Funcionario {
	private String setor;

	public Gerente(String nome, double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}
	
	@Override
	public double aumentarSalario() {
		return salario=salario*1.02 + 200;
	}
	
}
