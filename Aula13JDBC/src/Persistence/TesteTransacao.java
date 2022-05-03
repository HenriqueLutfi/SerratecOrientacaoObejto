package Persistence;

import java.sql.Connection;
import java.sql.SQLException;

import model.Produto;

public class TesteTransacao {

	public static void main(String[] args) {
		Produto p1 = new Produto(null, "4rw24", "Adria", 200.0, 100);
		Produto p2 = new Produto(null, "fafafa", "Adria", 131.0, 100);
		Produto p3 = new Produto(null, "eqeqeq", "Adria", 4324.0, 100);
		
		Connection connection = ConnectionFactorySingleton.getConnection();
		try {
			connection.setAutoCommit(false);
			ProdutoDao dao = new ProdutoDao(connection);
			dao.inserir(p1);
			dao.inserir(p2);
			dao.inserir(p3);
			connection.commit();
			System.out.println("produtos enviado para o banco de dados");
		} catch (Exception e) {
			try {
				//descarta  ja q nao pode ser inserido
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			
		}
		
		
	}

}
