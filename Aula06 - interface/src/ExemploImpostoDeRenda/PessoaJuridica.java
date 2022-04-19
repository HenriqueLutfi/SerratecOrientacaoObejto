package ExemploImpostoDeRenda;

public class PessoaJuridica extends Pessoa implements Tributos {
	private String cnpj;
	private String razaoSocial;

	public PessoaJuridica(String nome, String endereco, double rendimentos, String cnpj, String razaoSocial) {
		super(nome, endereco, rendimentos);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + "]";
	}

	@Override
	public double CalcularImpostoDeRenda() {
		return rendimentos * irendaPessoaJuridica;
	}

	@Override
	public double calcularIcms() {
		// TODO Auto-generated method stub
		return rendimentos*icms;
	}

}
