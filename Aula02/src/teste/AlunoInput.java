package teste;

import java.util.Scanner;

public class AlunoInput {
	public static void main(String[] args) {
		int qtd, i = 0;
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		//System.out.println("digite a quantidade de alunos \n");
		//qtd = sc.nextInt();
		// while (i<qtd) {
			System.out.println("digite o nome");
			aluno.nome = sc.nextLine();
			System.out.println("digite a nota1: ");
			aluno.nota1 = sc.nextInt();
			System.out.println("digite a nota2: ");
			aluno.nota2 = sc.nextInt();
			aluno.calculaMedia();
			System.out.println(aluno.nome);
			System.out.println(aluno.media);
			sc.close();
		// }
	}

}
