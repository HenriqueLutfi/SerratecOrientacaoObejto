package exercicioPlanoSaude;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("sul america", "checkup","22222");
		Medico medico = new Medico("golden", "1112","ana luiza");
		Anestesista anestesista = new Anestesista("amil","3232","carlos","geral");
		ControlePagamento cp = new ControlePagamento();
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPago(clinica);
		cp.calcularTotalPago(medico);
		cp.calcularTotalPago(anestesista);
		
		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);
		System.out.println("valor total pago [e: "+ String.format("%.2f", cp.getTotalPago()));
		
		
	}

}
