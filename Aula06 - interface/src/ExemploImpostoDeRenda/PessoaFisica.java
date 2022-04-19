package ExemploImpostoDeRenda;

public class PessoaFisica extends Pessoa implements Tributos {
	private String cpf;
	
	public PessoaFisica(String nome, String endereco, double rendimentos, String cpf) {
		super(nome, endereco, rendimentos);
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}


	@Override
	public String toString() {
		return "PessoaFisisca [cpf=" + cpf + "]";
	}

	@Override
	public double CalcularImpostoDeRenda() {
		// TODO Auto-generated method stub
		return rendimentos * irendaPessoaFisica;
	}
	
	@Override
	public double calcularIcms() {
		// TODO Auto-generated method stub
		return 0;
	}

}
