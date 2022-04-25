package ExemploVetor;

public class Exemplo1Vetor {
	public static void main(String[] args) {
		// String[] vetor = {"celular","tv","dvd"};
		// vetor[2]="som";

		String[][] funcionario = { { "ana maria", "anan@jhaa" }, { "joao", "haha@" }, { "carlos", "lalal@" } };
		
		for (int linha = 0; linha<funcionario.length; linha++) {
			for( int coluna =0; coluna<funcionario[linha].length;coluna++) {
				System.out.printf(funcionario[linha][coluna]);
			}
			System.out.println("\n");
		}
	}
}
