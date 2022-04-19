package ExercicioCidade;

public class TesteCidade {

	public static void main(String[] args) {
		Telefone[] telefones = new Telefone[2];
		telefones[0] = new Telefone("21321213");
		telefones[1] = new Telefone("111111");

		Estado estado = new Estado("rio de janeiro", "RJ");
		Cidade cidade = new Cidade("petropolis", estado);
		Endereco endereco = new Endereco("rua haha", "centro", "2222", cidade);

		Contato contato = new Contato("Bruno", telefones, endereco);

		System.out.println(contato.toString());

	}

}
