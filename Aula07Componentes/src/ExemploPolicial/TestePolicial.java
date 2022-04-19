package ExemploPolicial;

public class TestePolicial {
	public static void main(String[] args) {
		Policial p1 = new PolicialFederal("123","jorge",5000,"brasilia","2323");
		Policial p2 = new PolicialFederal("1222","adriano",6000,"rio","4654");
		
		System.out.println("total? " + Policial.getTotalPoliciais());
	}
}
