package ExemploArquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo4Leitura {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kappa\\Documents\\Henrique\\projeto\\serratec\\orientacao objeto\\Exemplo\\exericio2.txt"));
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
