package ExemploArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploArquivo {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Users\\kappa\\Documents\\Henrique\\projeto\\serratec\\orientacao objeto\\Exemplo\\exercicio.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			//hasNext enquanto tiver algo no arquivo continua
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("arquivo nao encontrado");
			e.printStackTrace();
		}
		

	}

}
