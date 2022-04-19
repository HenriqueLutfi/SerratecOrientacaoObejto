package ExercicioMaratona;

public class TesteMaratona {

	public static void main(String[] args) {
		AtletaAmador atletaAmador = new AtletaAmador("carla","f",17,1.32, true);
		AtletaProfissional atletaProfissional = new AtletaProfissional ("joao","m", 19, 1.50,87 );
		AtletaProfissional atletaProfissional2 = new AtletaProfissional ("carlos","m", 12, 1.80,56 );
		
		System.out.println(atletaAmador.toString());
		atletaAmador.verificaSituacao();
		System.out.println(atletaProfissional.toString());
		atletaProfissional.verificaSituacao();
		System.out.println(atletaProfissional2.toString());
		atletaProfissional2.verificaSituacao();
	}

}
