package ExercicioImobiliaria;

public class TesteImovel {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel("centro", 262626);
		Imovel imovel2 = new Imovel("bingen", 10000.0);
		
		Proprietario p1 = new Proprietario("mario",imovel2);
		
		System.out.println("proprietario: "+ p1.getNome());
		System.out.println(p1.getImovel());
		

	}

}