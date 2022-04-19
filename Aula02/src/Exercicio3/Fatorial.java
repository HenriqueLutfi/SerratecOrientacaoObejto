package Exercicio3;

public class Fatorial {

	public static void main(String[] args) {
		int valor=1;
		for (int i =1; i<=4;i++) {
			valor=1;
			for(int j = 1 ; j<=i; j++) {
				valor=valor*(i*j);
			}
			System.out.println(valor);
		}
	}
}
