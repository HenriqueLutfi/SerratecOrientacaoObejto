package ExemploImpostoDeRenda;

public abstract class Pessoa {
	protected String nome;
	protected String endereco;
	protected double rendimentos;

	public Pessoa(String nome, String endereco, double rendimentos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", rendimentos=" + rendimentos + "]";
	}

	public String getNome() {
		return nome;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public String getEndereco() {
		return endereco;
	}

}
