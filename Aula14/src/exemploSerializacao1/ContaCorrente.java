package exemploSerializacao1;

import Interface.Conta;

public class ContaCorrente implements Conta{

	@Override
	public void transacao() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void investimento() {
		// TODO Auto-generated method stub
		Conta.super.investimento();
	}
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.investimento();
	}

}
