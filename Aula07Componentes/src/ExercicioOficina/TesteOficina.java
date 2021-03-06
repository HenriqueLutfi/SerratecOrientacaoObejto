package ExercicioOficina;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("zeca");
		Proprietario proprietario2 = new Proprietario("joao");
		// sabado desconto de 50 na troca de oleo
		Carro carro = new Carro("civic", LocalDate.of(2022, 8, 16), proprietario, "sedan");
		Moto moto = new Moto("XRE", LocalDate.of(2022, 4, 16), proprietario2, 500);

		carro.trocarOleo();
		carro.revisao();
		carro.lavarVeiculo();
		moto.trocarOleo();
		System.out.println(carro.toString());
		System.out.println();
		System.out.println(moto.toString());
		System.out.println("\nquantidade de veiculos: " + Veiculo.getQtdVeiculos() + "\nquantidade de carros: "
				+ Carro.getQtdCarros() + "\nquantidade de motos: " + Moto.getQtdMotos());
	}

}
