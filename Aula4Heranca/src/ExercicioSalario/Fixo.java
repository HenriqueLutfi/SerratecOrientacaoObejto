package ExercicioSalario;

public class Fixo extends Vendedor {
	private double salarioBase;
	private double comissao;
	private double salarioBruto;

	public Fixo(String nome, String cpf, double salarioBase, double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto=salarioBase;//caso nao tenha venda nao tenho valor de salario bruto
		//portanto coloquei salario bruto [e igual ao salario base no inicio
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void calcularSalario(double valorDaVenda) {
		salarioBruto=salarioBase+valorDaVenda*comissao;
	}
}
