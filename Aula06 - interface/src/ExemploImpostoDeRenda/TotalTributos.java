package ExemploImpostoDeRenda;

public class TotalTributos {
	private double total;

	public void totalizarTributos(Tributos tributos) {
		total+=tributos.calcularIcms();
		total+=tributos.CalcularImpostoDeRenda();
		
	}

	public double getTotal() {
		return total;
	}
}
