package ExercicioLuta;

public class TesteLuta {

	public static void main(String[] args) {
		CategoriaLuta categoriaLuta = new CategoriaLuta(1, "peso medio");
		CategoriaLuta categoriaLuta2 = new CategoriaLuta(2, "peso pesado");

		NomeLutador nomeLutador = new NomeLutador("popo", categoriaLuta, 38, 75);
		NomeLutador nomeLutador2 = new NomeLutador("caca", categoriaLuta2, 25, 95);
		NomeLutador nomeLutador3 = new NomeLutador("lulu", categoriaLuta2, 32, 70);

		NomeLuta luta = new NomeLuta(nomeLutador, nomeLutador2, 10);
		
		if(luta.confirmaLuta()) {
			System.out.println("luta confirmada");
		}else {
			System.out.println("luta invalidade, categorias diferentes");
		}
	}

}
