package ExercicioAula;

public class Medico {
	protected String crm;
	protected String nome;
	protected double valorConsulta;

	public Medico(String crm, String nome, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.valorConsulta = valorConsulta;
	}
	@Override
	//override na funcao toString da classe objeto
	public String toString() {
		return (crm);
	}
	
	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}
	
}
