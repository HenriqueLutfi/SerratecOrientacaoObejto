package ExemploModelo;

public class TesteEquals {
	public static void main(String[] args) {
		Empregado e1 = new Empregado("pedro","analista");
		Empregado e2 = new Empregado("pedro","analista");
		if(e1.equals(e2)) {
			System.out.println("iguais");
		}else {
			System.out.println("diferentes");
		}
	}
}
