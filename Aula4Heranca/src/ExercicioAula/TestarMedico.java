package ExercicioAula;

public class TestarMedico {

	public static void main(String[] args) {
		Anestesista anestesista = new Anestesista("123", "maria",220,1000);
		Medico medico = new Medico("2432","ana",1000);
		System.out.println(anestesista.toString());
		System.out.println(medico.toString());
	}

}
