package org.serratec.model;

public class Imobiliaria {
	String tipoImovel;
	double valorImovel;
	String local;

	public void reajustarImovel() {
		if (tipoImovel.equals("apto")) {
			valorImovel *= 1.1;
		} else {
			valorImovel *= 1.05;
		}
	}

	//public static void main(String[] args) {
		//Imobiliaria i1 = new Imobiliaria();
		//i1.local = "centro";
		//i1.tipoImovel = "apto";
		//i1.valorImovel = 554820;
		//i1.reajustarImovel();
		//System.out.println(i1.valorImovel);
	//}

}
