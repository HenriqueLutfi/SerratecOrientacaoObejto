package ExercicioBiblioteca;

import ExemplosCompare.Pessoa;

public class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private double preco;
	private static double valorTotal;

	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		valorTotal = valorTotal + preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}
	
	@Override
	public int compareTo(Livro o) {
		return titulo.compareTo(o.getTitulo());
	}
}
