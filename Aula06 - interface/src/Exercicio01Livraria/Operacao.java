package Exercicio01Livraria;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, double valorOperacao, Livro livro) {
		super();
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	@Override
	public String toString() {
		return "Operacao [tipo=" + tipo + "]" + livro + valorOperacao;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * valorOperacao + livro.getValor() * (taxaEmprestimo) / 100;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() * valorOperacao;
	}

}
