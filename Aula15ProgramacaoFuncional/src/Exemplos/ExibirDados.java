package Exemplos;

import java.util.function.Consumer;

import Model.Aluno;

public class ExibirDados implements Consumer<Aluno>{

	@Override
	public void accept(Aluno t) {
	/*	System.out.println(t.getNome());
		System.out.println(t.getEmail());
		System.out.println(t.getIdade());
		*/
		System.out.println(t);
	}

}
