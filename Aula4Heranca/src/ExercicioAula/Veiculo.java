package ExercicioAula;

public class Veiculo {
	private String Placa;
	private String chassi;
	protected double valorIPVA;
	private String cor;

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public double getValorIPVA() {
		return valorIPVA;
	}

	public void setValorIPVA(double valorIPVA) {
		this.valorIPVA = valorIPVA;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void adicionarValorIPVA(double valor) {
		valorIPVA = valorIPVA * 1.10;
	}
}
