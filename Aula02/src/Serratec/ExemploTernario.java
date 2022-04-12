package Serratec;

public class ExemploTernario {
	public static void main(String[] args) {
		boolean f = (1 > 5);
		boolean a = !(1 < 5);
		System.out.println(a);

		int dia = 30;
		if (dia < 30) {
			System.out.println("mes fevereiro");
		} else {
			System.out.println("outro mes");
		}
		// pergunta se dia [e menor que 30, se for verdadeiro eh a primeira opcao senao for a segunda opcao apos ":"
		System.out.println(dia < 30 ? "mes fevereiro" : "outro mes");// if ternario
	}
}
