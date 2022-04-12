package Serratec;

public class Switch {
	public static void main(String[] args) {
		int avaliacao = 4;
		//como se fosse um if para cada caso possivel
		switch (avaliacao) {
		case 5:
			System.out.println("excelente");
			break;//colocar break senao ele ira verificar todos os casos
		case 4:
			System.out.println("uma bosta");
			break;
		case 6:
			System.out.println("lalala");
			break;
		}
		String nome = "hahaha";
	}
}
