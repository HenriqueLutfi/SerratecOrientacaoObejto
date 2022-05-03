package exemploSerializacao1;

import Interface.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = () -> System.out.println("transacao realiza dom sucesso");
		
		
		Conta conta2 = ()->System.out.println("transacao efetuada!");
		conta.transacao();
		conta2.transacao();
		conta.investimento();
	}
}
