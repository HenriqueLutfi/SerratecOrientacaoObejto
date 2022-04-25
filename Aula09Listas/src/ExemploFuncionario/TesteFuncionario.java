package ExemploFuncionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Funcionario("jefe", "gerente", 110);
		funcionarios[1] = new Funcionario("dadada", "vcvcv", 110);
		funcionarios[2] = new Funcionario("fafw", "rqe", 110);

		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println(funcionarios[i]);
		}

	}

}
