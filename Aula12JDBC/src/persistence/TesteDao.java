package persistence;

public class TesteDao {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		/*Cliente cliente = new Cliente(null,"marta","2222","hahah@haha");
		dao.inserir(cliente);*/
		/*Cliente cliente = new Cliente(1,"joao da silva","2222","jose@haha");
		dao.autalizar(cliente);*/
		//dao.apagar(1);
		/*for (Cliente cliente : dao.listar()) {
			System.out.println(cliente);
		}*/
		
		System.out.println(dao.buscar(2));
	}
}
