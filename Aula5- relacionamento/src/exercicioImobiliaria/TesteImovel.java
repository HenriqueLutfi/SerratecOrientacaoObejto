package exercicioImobiliaria;

public class TesteImovel {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("21321","roni","ror@haha");
		Pessoa pessoa2 = new Pessoa("1312312","fafafa","3131@dada");
		Imovel imovel = new Imovel("casa",11212,pessoa);
		
		System.out.println("Imovel: "+ imovel.getTipo()+"-valor: "
				+imovel.getValor() + "\ndono: "+ imovel.getDono().getNome());
	}
	
}
