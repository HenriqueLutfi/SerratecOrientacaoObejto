package ExemplosGenerics;

public class TesteMyGenerics {
	public static void main(String[] args) {
		/*MyGenerics<Integer> myg1 = new MyGenerics<Integer>(100);
		MyGenerics<String> myg2 = new MyGenerics<String>("ola");
		System.out.println(myg1);
		System.out.println(myg2);*/
		
		//? coringa no casso recebe qualquer coisa derivada de number
		MyGenerics<? super Number>myg = new MyGenerics(1000);
		myg.setValor(new Integer(1100));
		myg.setValor(50.5);
		//myg.setValor("ola");//nao roda pois nao deriva de number
	}
}
