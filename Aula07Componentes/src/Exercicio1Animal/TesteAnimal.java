package Exercicio1Animal;

import java.time.LocalDate;

public class TesteAnimal {
	public static void main(String[] args) {

		Tucano tucano = new Tucano("tucano azul", LocalDate.of(2022, 03, 14), "azul", 15);
		Cavalo cavalo = new Cavalo("epona", LocalDate.of(2022, 02, 15), "mustangue", "relampago mcquen");
		Cachorro cachorro = new Cachorro("caramelo", LocalDate.of(2015, 02, 15), "VL", false);

		System.out.println(tucano.emitirSom());
		System.out.println(tucano.voar());
		System.out.println(cachorro.emitirSom());
		System.out.println(cavalo.emitirSom());
		cavalo.viajar();
		System.out.println(Animal.getQtdAnimal());

	}

}
