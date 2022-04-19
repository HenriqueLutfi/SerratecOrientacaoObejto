package exercicioPlanoSaude;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String nome, String crm, String nomeMedico, String tipoAnestesia) {
		super(nome, crm, nomeMedico);
		this.tipoAnestesia = tipoAnestesia;
	}
	public String gettipoAnestesia() {
		return tipoAnestesia;
	}
	@Override
	public String toString() {
		return super.toString() + "tipo anestesia: "+ tipoAnestesia;
	}
	@Override
	public double calcularPagamento() {
		valorPago= super.calcularPagamento()+1000;
		return valorPago;
	}
}
