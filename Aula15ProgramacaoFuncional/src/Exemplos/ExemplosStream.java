package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Model.Aluno;

public class ExemplosStream {
	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "henrique", "hahah@ajja", 13);
		Aluno a2 = new Aluno(2, "cada", "gdgdfg@ajja", 24);
		Aluno a3 = new Aluno(3, "gdsdfs", "fsfs@ajja", 53);
		Aluno a4 = new Aluno(4, "gfgf", "qweq@ajja", 64);
		Aluno a5 = new Aluno(5, "tete", "hfgnh@ajja", 23);
		List<String> cores = Arrays.asList("preto","amarelo","verde");
		
		Stream<String> streamCores=cores.stream();
		streamCores.forEach(c -> System.out.println(c));
		
		List<Aluno>alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Stream<Aluno>streamAlunos = alunos.stream();
		
		//transforma o objeto original e insere na lista nomes
		List<String> nomes = streamAlunos.map(a -> a.getNome().substring(0, 3)).collect(Collectors.toList());
		System.out.println(nomes);
	}
}
