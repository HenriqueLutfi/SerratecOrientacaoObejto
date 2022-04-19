package Salarios;

public class AuxiliarAdm extends Auxiliar {
	private String sala;
	
	
	public AuxiliarAdm(String nome, double salario, String setor, String sala) {
		super(nome, salario, setor);
		this.sala = sala;
	}


	public String getSala() {
		return sala;
	}


	@Override
	public void calcularAumentoSalario() {
		// TODO Auto-generated method stub

	}

}
