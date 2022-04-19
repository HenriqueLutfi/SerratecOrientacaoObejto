package ExemploImpostoDeRenda;

public class TestePessoa {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("marcos", "rua a 80, centro", 8500, "545646");
		PessoaJuridica pj = new PessoaJuridica("xpto", "rua bingen", 250900, "1212", "xpto ltds");
		TotalTributos tt = new TotalTributos();

		System.out.println("total IR: " + pf.CalcularImpostoDeRenda());
		System.out.println("total IR PJ: " + pj.CalcularImpostoDeRenda());
		System.out.println("total ICMS: " + pj.calcularIcms());
		tt.totalizarTributos(pf);
		tt.totalizarTributos(pj);

		System.out.println("total geral: " + tt.getTotal());
	}
}
