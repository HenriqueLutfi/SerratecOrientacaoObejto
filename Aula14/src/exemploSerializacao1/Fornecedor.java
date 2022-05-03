package exemploSerializacao1;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author kappa
 * @version 1.0
 *
 */
public class Fornecedor implements Serializable {
	private String cnpj;
	private String nome;
	private String email;
	private Double comissao;

	/**
	 * 
	 * @param cnpj  haha
	 * @param nome adada
	 * @param email adadadad
	 * @param comissao qeqeqeq
	 */
	public Fornecedor(String cnpj, String nome, String email, Double comissao) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.comissao = comissao;

	}

	/**
	 * 
	 * @return o cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getComissao() {
		return comissao;
	}
	
	/**
	 * 
	 * @param valor recebe de entrada
	 * @return valor do pagamento
	 * @throws IllegalArgumentException caso valor ne
	 */
	public Double calcularPagamento(Double valor) throws IllegalArgumentException{
		return 0.0;
	}

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + ", comissao=" + comissao + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

}
