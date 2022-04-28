package ExemploArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo2Arquivo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner( new File(
					"C:\\Users\\kappa\\Documents\\Henrique\\projeto\\serratec\\orientacao objeto\\Exemplo\\exercicio2.txt"));
			sc.useDelimiter(";");
			// hasNext enquanto tiver algo no arquivo continua
			while (sc.hasNext()) {
				//next para imprimir a cada ; do arquivo
				System.out.println(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("arquivo nao encontrado");
			e.printStackTrace();
		}
	}
}
