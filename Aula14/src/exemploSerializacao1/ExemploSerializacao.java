package exemploSerializacao1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializacao {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("11212", "empresa zpto", "hahaha@kaka",100.0);
		Fornecedor f2 = new Fornecedor("1321231", "dadada", "dadad@kaka",500.0);
		Fornecedor f3 = new Fornecedor("11212", "empresa zpto", "hahaha@kaka",100.0);
		if(f1.equals(f3)) {
			System.out.println("mesmo cnpj");
		}else {
			System.out.println("diferentes");
		}
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(f1);
		fornecedores.add(f2);
		
		try {
			FileOutputStream arquivoGravar = new FileOutputStream("C:\\Users\\kappa\\Documents\\Henrique\\projeto\\serratec\\orientacaoObjeto\\Exemplo\\fornecedor.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(f1);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.close();
			System.out.println("objeto gravado");
		} catch (Exception e) {
			System.out.println("nao eh possivel gravar o objeto");
			e.printStackTrace();
		}
		System.out.println("leitura do objeto criado");
		try {
			FileInputStream caminhoArquivo = new FileInputStream("C:\\Users\\kappa\\Documents\\Henrique\\projeto\\serratec\\orientacaoObjeto\\Exemplo\\fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(caminhoArquivo);
			lerObjeto.close();
			caminhoArquivo.close();
		} catch (Exception e) {
			System.out.println("erro ao ler o arquivo");
		}
	}

}
