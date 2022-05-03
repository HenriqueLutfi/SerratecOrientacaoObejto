package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Model.Aluno;

public class Exemplo1 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "henrique", "hahah@ajja", 13);
		Aluno a2 = new Aluno(2, "cada", "gdgdfg@ajja", 24);
		Aluno a3 = new Aluno(3, "gdsdfs", "fsfs@ajja", 53);
		Aluno a4 = new Aluno(4, "gfgf", "qweq@ajja", 64);
		Aluno a5 = new Aluno(5, "tete", "hfgnh@ajja", 23);

		// nao pode adicionar mais nada na lista, pode somente ser atualizada
		// nao precisa de new por ser um metodo estatico
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		// com lambda
		// alunos.forEach(a -> System.out.println(a));

		// com outra classe
//		ExibirDados exibirDados = new ExibirDados();
//		alunos.forEach(exibirDados);

		// com classe anonima
		/*Consumer<Aluno> alunoConsumer = new Consumer<Aluno>() {

			@Override
			public void accept(Aluno t) {
				System.out.println(t);

			}

		};
		
		alunos.forEach(alunoConsumer);
		*/
		
		//lambda pegando somente algumas informacoes
		/*alunos.forEach(a -> {
			System.out.println(a.getNome());
			System.out.println(a.getIdade());
		});*/
		
		
		System.out.println("imprimindo com Method reference");
		//: faz referencia a lista e pega o toString
		alunos.forEach(System.out::println);
	}
}
