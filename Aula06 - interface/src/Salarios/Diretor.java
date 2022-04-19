package Salarios;

public class Diretor extends Funcionario {
	private String tipo;


	
	public Diretor(String nome, double salario, String tipo) {
		super(nome, salario);
		this.tipo = tipo;
	}



	public String getTipo() {
		return tipo;
	}



	@Override
	public String toString() {
		return "Diretor " + tipo + ", nome " + nome + ", salario " + salario;
	}



	@Override
	public void calcularAumentoSalario() {
		salario = salario*1.2;

	}

}
