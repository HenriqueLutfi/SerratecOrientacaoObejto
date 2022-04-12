package Exemplo;

public class Variaveis {
	public static void main(String[] args) {
		String text; // texto
		int numi =1, numi2 =3;//numero inteiro
		float numf=2.5f,numf2=5; // com casa decimal
		double num2=2.55555; // com mais casa decimal
		float soma;
		int soma2;
		soma = numi+numi2; // se a variavel soma for de um tipo de variavel superior a variavel do calculo, fazer direto
		soma2 = (int)(numf+numf2);//se a variavel for de um nivel superior, deve diminuir um nivel da variavel do calculo
		System.out.println(soma);// usar atalho "syso" depois crtl+espaco
	}
}
