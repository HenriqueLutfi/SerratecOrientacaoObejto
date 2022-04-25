package ExemploExceptions;

public class Exemplo2Excessao {
	public static void main(String[] args) {
		String fraseInicial = null;
		String fraseFinal = null;
		
		try {
			fraseFinal=fraseInicial.toUpperCase();
			System.out.println("resultado: "+fraseFinal);
			
		}catch (NullPointerException e) {
			System.out.println("falha ao converter !");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
