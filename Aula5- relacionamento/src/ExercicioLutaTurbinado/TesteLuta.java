package ExercicioLutaTurbinado;

public class TesteLuta {

	public static void main(String[] args) {

		CategoriaLuta[] categoriaLutas = new CategoriaLuta[2];

		categoriaLutas[0] = new CategoriaLuta(1, "peso medio", 70, 80);
		categoriaLutas[1] = new CategoriaLuta(2, "peso pesado", 80, 100);

		NomeLutador[] nomeLutadores = new NomeLutador[3];
		nomeLutadores[0] = new NomeLutador("popo", 38, 75);
		nomeLutadores[1] = new NomeLutador("caca", 25, 95);
		nomeLutadores[2] = new NomeLutador("lulu", 32, 70);

		NomeLuta luta = new NomeLuta(nomeLutadores[2], nomeLutadores[0], 10);
		
		for(int i=0;i<nomeLutadores.length;i++) {
			nomeLutadores[i].VerificaCategoria(categoriaLutas);
		}

		if (luta.confirmaLuta()) {
			System.out.println(luta.toString());
		} else {
			System.out.println("luta invalidade, categorias diferentes");
		}
		
	}

}
