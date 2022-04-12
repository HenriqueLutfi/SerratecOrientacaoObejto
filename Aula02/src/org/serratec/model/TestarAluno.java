package org.serratec.model;

public class TestarAluno {
	public static void main(String[] args) {
		//criacao de uma isntancia de objeto
		Aluno a1=new Aluno();
		Aluno a2=new Aluno();
		a1.codigoAluno=10;
		a1.nome="cu";
		a1.telefone = "2236-9574";
		
		System.out.println(a1.nome);
		System.out.println(a2);
	}
}
