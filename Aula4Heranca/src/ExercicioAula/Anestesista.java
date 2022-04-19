package ExercicioAula;

public class Anestesista extends Medico {
	private double valorAnestesia;

	public Anestesista(String crm, String nome, double valorConsulta,double valorAnestesia) {
		super(crm, nome, valorConsulta);
		this.valorAnestesia=valorAnestesia;
	}
	
	@Override
	public String toString() {// da o override na funcao toString da classe superior (medico)
		return super.toString() + " valor da anestesia: " + valorAnestesia;
	}
	
	public double getValorAnestesia() {
		return valorAnestesia;
	}
	
	
}
