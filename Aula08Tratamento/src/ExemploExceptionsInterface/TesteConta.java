		package ExemploExceptionsInterface;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente("1223", "roni", 1000);

		try {
			cc.deposito(100);
			cc.saque(2000);
		} catch (ContaException e) {
			//pegando msg do construtor do illegal
			System.out.println(e.getMessage());  
		}
	}

}
