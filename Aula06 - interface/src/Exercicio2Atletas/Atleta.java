package Exercicio2Atletas;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais;

	public Atleta(String nome, double peso, String modalidade, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", peso=" + peso + ", modalidade=" + modalidade + ", pais=" + pais + "]";
	}

	@Override
	public String verificaSituacao() {
		if (peso > 90) {
			totalParticipantes++;
			return "peso pesado" + " particiapara";
		} else if (peso >= 60 && peso <= 90) {
			totalParticipantes++;
			return "peso medio" + " particiapara";
		} else {
			return " nao participara";
		}
	}

}
