package teste;

public class Aluno {
	String nome;
	float nota1;
	float nota2;
	float media;
	
	public void calculaMedia () {
		media = (nota1+nota2)/2;
	}
}
