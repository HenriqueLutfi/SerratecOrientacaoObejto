package ExercicioOficina;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	private static int qtdVeiculos;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
		qtdVeiculos++;
	}

	public String getModelo() {
		return modelo;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public static int getQtdVeiculos() {
		return qtdVeiculos;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {	
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return TipoServico.REVISAO.getValorPorServico();
	}

}
