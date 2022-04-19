package ExercicioImobiliaria;

public class Casa extends Imovel {
	private boolean garagem;

	public Casa(String local, double valor, boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	public boolean isGaragem() {
		return garagem;
	}
	
	@Override
	public String toString(){
		return super.toString() + " "+ (garagem? " casa tem garagem ": "casa nao tem garagem");
	}
	
	
}
