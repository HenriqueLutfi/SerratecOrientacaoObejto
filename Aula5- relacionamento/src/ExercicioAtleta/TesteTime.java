package ExercicioAtleta;

public class TesteTime {
	public static void main(String[] args) {
		Atleta atleta = new Atleta("Diego",20,"goleito");
		Atleta atleta1 = new Atleta("carlo",25,"lateral");
		Atleta atleta3 = new Atleta("dadada",12,"atacante");
		
		Time time = new Time("flamengo","paulo souza",new Atleta[3]);
		time.inserirAtletas(atleta);
		time.inserirAtletas(atleta1);
		time.inserirAtletas(atleta3);
		
		System.out.println("time: "+ time.getNomeTime());
		time.listaTime();
	}
	
}
