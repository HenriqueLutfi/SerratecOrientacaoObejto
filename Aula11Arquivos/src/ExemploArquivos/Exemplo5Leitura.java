package ExemploArquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Exemplo5Leitura {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("C:\\Users\\kappa\\Documents\\Henrique\\projeto\\serratec\\orientacao objeto\\Exemplo\\exericio2.txt"),"UTF-8"));
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
