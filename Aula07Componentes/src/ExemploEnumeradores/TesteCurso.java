package ExemploEnumeradores;

public class TesteCurso {

	public static void main(String[] args) {
		Turma turma = new Turma("java web", PeriodoCurso.NOTURNO);
		System.out.println("curso: " + turma.getCurso());
		System.out.println("turno do curso: "+ turma.getPeriodoCurso());
		System.out.println(turma.getPeriodoCurso().getDiasDaSemana());
		System.out.println(turma.getPeriodoCurso().getValor());
		System.out.println(turma.getPeriodoCurso().getCargaHoraria());
	}

}
