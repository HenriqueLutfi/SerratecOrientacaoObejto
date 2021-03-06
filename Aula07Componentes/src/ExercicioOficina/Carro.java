package ExercicioOficina;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;
	private static int qtdCarros;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
		qtdCarros++;
	}

	public String getCategoria() {
		return categoria;
	}
	

	public static int getQtdCarros() {
		return qtdCarros;
	}

	@Override
	public String toString() {
		return "proprietario: " + proprietario + "\nmodelo: " + modelo + " categoria: " + categoria
				+ "\ndataConserto: " + dataConserto + "\ntotal pelos servicos: R$" + valorCobrado;
	}

	@Override
	public double lavarVeiculo() {
		super.valorCobrado += super.lavarVeiculo();
		return super.lavarVeiculo();
	}

	@Override
	public double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			super.valorCobrado += super.trocarOleo() - 50;
			return super.trocarOleo() - 50;
		} else {
			super.valorCobrado += super.trocarOleo();
			return super.trocarOleo();
		}

	}

	@Override
	public double revisao() {
		if (dataConserto.getMonthValue() == 8) {
			super.valorCobrado += super.revisao() * 0.9;
			return super.revisao() * 0.9;
		} else {
			super.valorCobrado += super.revisao();
			return super.revisao();
		}

	}
}
