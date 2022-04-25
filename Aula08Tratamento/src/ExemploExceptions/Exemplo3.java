package ExemploExceptions;

public class Exemplo3 {

	public static void main(String[] args) {
		int vetor[] = { 10, 20, 30 };

		int a = 30, b = 0, c = 0;
		String nome = null;
		try {
			System.out.println(nome.equals("fulano"));
			System.out.println("vetor posicao 3: " + vetor[3]);
			c = a / b;
		// caso o erro esteja na mesma hierarquia pode usar o ou
		// catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
		} catch (ArithmeticException e) {
			System.out.println("erro divisao por zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("vetor fora de faixa ");
		} catch (NullPointerException e) {
			System.out.println("esqueceu da instancia do objeto");
		}

	}

}
