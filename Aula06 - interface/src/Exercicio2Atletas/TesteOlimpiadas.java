package Exercicio2Atletas;

public class TesteOlimpiadas {

	public static void main(String[] args) {
		Pais pais = new Pais("brasil");
		Pais pais1 = new Pais("Congo");
		Atleta atleta = new Atleta("carlos", 95, "hahaha", pais);
		Atleta atleta1 = new Atleta("joao", 58, "hahaha", pais1);
		Atleta atleta2 = new Atleta("flavio", 75, "hahaha", pais);

		System.out.println(atleta.toString() + atleta.verificaSituacao());
		System.out.println(atleta1.toString() + atleta1.verificaSituacao());
		System.out.println(atleta2.toString() + atleta2.verificaSituacao());
		System.out.println(Atleta.getTotalParticipantes());
	}
}
