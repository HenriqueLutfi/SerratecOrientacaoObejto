package ExercicioMaratona;

public class Maratona {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;

	public Maratona(String nome, String sexo, int idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public void verificaSituacao() {
		if(idade>=18 || altura>=1.80){
			System.out.println("participara da competicao");
		}else {
			System.out.println("nao participara da competicao");
		}
	}
}
