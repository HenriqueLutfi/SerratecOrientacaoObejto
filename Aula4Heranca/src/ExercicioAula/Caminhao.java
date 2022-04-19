package ExercicioAula;

public class Caminhao extends Veiculo {
	private int cargaMaxima;

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public void adicionarValorIPVA(double valor) {
		//valorIPVA = valorIPVA + valor * 2;
		super.adicionarValorIPVA(valor * 2);
	}
}
