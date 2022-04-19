package ExercicioLutaTurbinado;

public class NomeLuta {
	private NomeLutador desafiante;
	private NomeLutador desafiado;
	private int rounds;
	private boolean confirmado;

	public NomeLuta(NomeLutador desafiante, NomeLutador desafiado, int rounds) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
	}

	public NomeLutador getDesafiante() {
		return desafiante;
	}

	public NomeLutador getDesafiado() {
		return desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public boolean isConfirmado() {
		return confirmado;
	}

	@Override
	public String toString() {
		return "O desafiante " + desafiante + " contra o desafiado " + desafiado + "\nrounds: " + rounds
				+ " foi confirmada";
	}

	public boolean confirmaLuta() {
		if (desafiante.getCategoriaLuta() == desafiado.getCategoriaLuta()) {
			return confirmado = true;
		} else {
			return confirmado = false;
		}
	}
}
