package ExercicioImobiliaria;

public class Apto extends Imovel {
	private int andar;
	private int numero;
	
	public Apto(String local, double valor, int andar, int numero) {
		super(local, valor);
		this.andar = andar;
		this.numero = numero;
	}
	public int getAndar() {
		return andar;
	}
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return super.toString()	+"andar " + andar + " numero" + numero;
	}
	
	
	
	
}
