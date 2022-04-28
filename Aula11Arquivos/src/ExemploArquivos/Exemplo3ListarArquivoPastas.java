package ExemploArquivos;

import java.io.File;
import java.util.Scanner;

public class Exemplo3ListarArquivoPastas {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite o arquivo ou diretorio");
		String nome = sc.next();
		File file = new File(nome);
		if(file.exists()) {
			if (file.isFile()) {
				System.out.printf("arquivo (%s)existe e o tamanho eh de %d",file.getName(),file.length());		
			}else {
				System.out.println("o conteudo da pasta eh: ");
				//String[] diretorio = file.list();
				for (String item : file.list()) {
					System.out.println(item);
				}
			}
		}else {
			System.out.println("arquivo ou diretorio nao encontrado");
		}
	}
}
