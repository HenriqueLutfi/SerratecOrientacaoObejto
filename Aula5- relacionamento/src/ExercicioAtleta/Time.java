package ExercicioAtleta;

public class Time {
	private String nomeTime;
	private String tecnico;
	private Atleta[] atletas;

	public Time(String nomeTime, String tecnico, Atleta[] atletas) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.atletas = atletas;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public void inserirAtletas(Atleta atleta) {
		//conta a quantidade de index do vetor
		for( int i= 0; i < atletas.length; i++) {
			if (atletas[i]==null) {
				atletas[i]= atleta;
				return;
			}
		}
		
	}
	
	public void listaTime() {
		for(int i=0;i<atletas.length;i++) {
			System.out.println("nome atleta: " + atletas[i].getNome());
		}
	}

}
