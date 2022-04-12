package org.serratec.model;

public class TestarImobiliaria {
	public static void main(String[] args) {
		Imobiliaria i1 = new Imobiliaria();
		i1.local = "centro";
		i1.tipoImovel = "apto";
		i1.valorImovel = 554820;
		i1.reajustarImovel();
		System.out.println(i1.valorImovel);
		
		Imobiliaria i2 = new Imobiliaria();
		i2.local = "centro";
		i2.tipoImovel = "apto";
		i2.valorImovel = 554820;
		i2.reajustarImovel();
		System.out.println(i2.valorImovel);
	}
}
