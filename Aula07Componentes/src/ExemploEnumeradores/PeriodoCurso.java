package ExemploEnumeradores;

public enum PeriodoCurso {
	INTEGRAL ("segunda a sexta",80,3600),
	NOTURNO ("segunda a sexta",80,1200),
	MANHA ("segunda a sexta",80,2400);
	
	private String diasDaSemana;
	private int cargaHoraria;
	private double valor;
	private PeriodoCurso(String diasDaSemana, int cargaHoraria, double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}
	public String getDiasDaSemana() {
		return diasDaSemana;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public double getValor() {
		return valor;
	}
	
}
