package Exercicio2;

public class Assistente extends Funcionario {
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}
	@Override
	public double aumentarSalario() {
		return salario=salario + adicional;
	}
}
