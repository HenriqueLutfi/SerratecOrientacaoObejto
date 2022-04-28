package ExercicioAluno;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("dada", 10, 5);
		Aluno aluno1 = new Aluno("jeje", -7, 3);
		Aluno aluno2 = new Aluno("ueueue", 8, 2);

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno);
		alunos.add(aluno1);
		alunos.add(aluno2);

		for (Aluno aluno3 : alunos) {
			try {
				System.out.println(aluno3.calcularMedia());
			} catch (AlunoException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
