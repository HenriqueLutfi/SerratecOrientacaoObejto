package ExercicioAula;

public class Gerente extends Funcionario{//herdando as funcionalidades da classe funcionario
	private int senha;
	private int numeroDeFuncionarios;
	
	public boolean autentica(int senha) {
		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	
}