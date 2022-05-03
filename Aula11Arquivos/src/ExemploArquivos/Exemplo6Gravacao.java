package ExemploArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6Gravacao {

	public static void main(String[] args) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(
					"C:\\Users\\kappa\\Documents\\Henrique\\projeto\\serratec\\orientacaoObjeto\\Exemplo\\exercicio2.txt"));
			bw.append("serratec-java");
			bw.append("lerolero");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
