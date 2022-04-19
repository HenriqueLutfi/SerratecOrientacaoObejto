package Exercicio2;

public class Produto {
	private String descricao;
	private double valor;
	private int qtd;
	
	public double calcularIcms() {
		return valor*qtd*0.12;
	}
}
