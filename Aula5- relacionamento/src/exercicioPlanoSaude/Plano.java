package exercicioPlanoSaude;

public class Plano {
	protected String nome;
	protected double valorPago = 80.0;
	protected double valorInss = 5;

	public Plano(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public double getValorPago() {
		return valorPago;
	}

	public double getValorInss() {
		return valorInss;
	}

	@Override
	public String toString() {
		// %.2f para ficar com duas casas decimais
		return "plano: " + nome + " valor pago " + String.format("%.2f", valorPago);
	}
	public double calcularPagamento() {
		valorPago = valorPago - valorPago*valorInss/100;
		return valorPago;
	}
}
