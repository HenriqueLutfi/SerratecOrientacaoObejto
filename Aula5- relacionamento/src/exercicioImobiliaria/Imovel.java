package exercicioImobiliaria;

public class Imovel {
	private String Tipo;
	private double valor;
	private Pessoa dono;

	public Imovel(String tipo, double valor, Pessoa dono) {
		super();
		Tipo = tipo;
		this.valor = valor;
		this.dono = dono;
	}

	public String getTipo() {
		return Tipo;
	}

	public double getValor() {
		return valor;
	}

	public Pessoa getDono() {
		return dono;
	}

}
