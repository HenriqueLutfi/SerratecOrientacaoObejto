package ExercicioOficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;
	private static int qtdMotos;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
		qtdMotos++;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public String toString() {
		return "proprietario: " + proprietario + "\nmodelo: " + modelo + " cilindradas: " + cilindradas
				+ "\ndataConserto: " + dataConserto + "\ntotal pelos servicos: R$" + valorCobrado;
	}

	public static int getQtdMotos() {
		return qtdMotos;
	}

	@Override
	public double lavarVeiculo() {
		super.valorCobrado += super.lavarVeiculo();
		return super.lavarVeiculo();
	}

	@Override
	public double trocarOleo() {
		super.valorCobrado += super.trocarOleo();
		return super.trocarOleo();
	}

	@Override
	public double revisao() {
		super.valorCobrado += super.revisao();
		return super.revisao();
	}
}
