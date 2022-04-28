package ExercicioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String resposanvel;
	private List<Livro> lista;

	public Biblioteca(String resposanvel) {
		super();
		lista = new ArrayList<>();
		this.resposanvel = resposanvel;
		// this.lista = lista;
	}

	public String getResposanvel() {
		return resposanvel;
	}

	public List<Livro> getLista() {
		return lista;
	}

	public void adicionar(Livro livro) {
		lista.add(livro);
	}

	public void remover(Livro livro) {
		lista.remove(livro);
	}

	public int calcularTotalLivros() {
		return lista.size();
	}
	
	public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) {
		return	0;
	}

	@Override
	public String toString() {
		return "Biblioteca [resposanvel=" + resposanvel + "]" + lista;
	}

}
