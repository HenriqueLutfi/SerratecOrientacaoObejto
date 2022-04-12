package org.serratec.model;

public class Veiculo {
	String placa;
	String tipoCombustivel;
	double valor;
	
	public double calcularIPVA() {
		if (tipoCombustivel.equals("flex") || tipoCombustivel.equals("gasolina")) {
			return valor*0.04;	
		}else {
			return valor*0.015;
		}
	}
}
