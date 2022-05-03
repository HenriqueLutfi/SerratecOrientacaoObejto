package Exemplo1Funcionario;

public class Seguro {
	private String cobertura;
	private Double valorSeguro;

	public Seguro() {
		// TODO Auto-generated constructor stub
	}
	
	public Seguro(String cobertura, Double valorSeguro) {
		super();
		this.cobertura = cobertura;
		this.valorSeguro = valorSeguro;
	}

	public String getCobertura() {
		return cobertura;
	}

	public Double getValorSeguro() {
		return valorSeguro;
	}

	@Override
	public String toString() {
		return "Seguro [cobertura=" + cobertura + ", valorSeguro=" + valorSeguro + "]";
	}

}
