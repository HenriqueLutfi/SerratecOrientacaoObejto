package Serratec;

public class conversao {
	public static void main(String[] args) {
		int a = 100;
		float b=5.24f;
		int d;
		double c = 4.35;
		double soma = (double) (a + b);
		b = a;// upgrade ? automatico
		d = (int) c;// fazer casting quando for dowgrade de variavel
	}
}
