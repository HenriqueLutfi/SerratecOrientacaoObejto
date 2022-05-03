package ExemploFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Model.Aluno;

public class Exemplo1Filters {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(1, "henrique", "hahah@ajja", 13);
		Aluno a2 = new Aluno(2, "cada", "gdgdfg@ajja", 24);
		Aluno a3 = new Aluno(3, "gdsdfs", "fsfs@ajja", 53);
		Aluno a4 = new Aluno(4, "gfgf", "qweq@ajja", 64);
		Aluno a5 = new Aluno(5, "tete", "hfgnh@ajja", 23);
		List<Aluno>alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		//filtra no filter com os parametros e depois faz a lista no forEach
		alunos.stream().filter(a-> a.getIdade()>30).forEach(a -> System.out.println(a));
		//filtro pela letra inicial
		alunos.stream().filter(a-> a.getNome().startsWith("h")).forEach(a->System.out.println(a));
		System.out.println();
		//pula o primeiro
		alunos.stream().skip(1).forEach(a->System.out.println(a));
		
		//limitar
		alunos.stream().limit(1).forEach(a->System.out.println(a));
	}
}
