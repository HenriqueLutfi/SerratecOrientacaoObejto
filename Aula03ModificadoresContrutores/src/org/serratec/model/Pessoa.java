package org.serratec.model;

public class Pessoa {
	private int codigoPessoa;
	private String nome;
	private double peso;
	private double altura;

	public void setCodigoPessoa(int codigoPessoa) {
		if (codigoPessoa<0) {
			System.out.println("codigo invalido");
		}else {
			this.codigoPessoa = codigoPessoa;// this para referenciar o codigo pessoa dessa classe
		}
	}

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	private double calcularIMC() {
		return peso / (altura * altura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String resultado() {
		String resultado;
		if (calcularIMC() < 18.5) {
			resultado = "abaixo do peso";
		} else {
			resultado = "acima do peso";
		}
		return resultado;
	}
}
