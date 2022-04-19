package ExemploEmpresa;

import ExemploEmpresa.Pessoa.Escolaridade;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("carlos", "carlos@haha", Setor.COMPRAS, EstadoCivil.SOLTEIRO,Escolaridade.FUNDAMENTAL);
		System.out.println(p1);
		//valor do index do vetor do setor
		System.out.println(p1.getSetor().ordinal());
		System.out.println(p1.getSetor().getSala());
		//CONFERE SE COTABILIDADE ESTA NO VETOR
		//System.out.println(p1.getSetor().valueOf("CONTABILIDADE"));
		
		for(EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil.getValor());
		}
	}

}
