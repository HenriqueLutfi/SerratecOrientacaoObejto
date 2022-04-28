package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String urlConexao="jdbc:postgresql://localhost:5432/testebd";
	private String usuario = "postgres";
	private String senha="Po22375606!";
	
	private Connection connection;

	public Connection getConnection() {
		System.out.println("conectando ao banco de dados");
		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			if(connection == null) {
				System.out.println("nao foi possivel conectar");
			}else {
				System.out.println("conectado com sucesso");
			}
		} catch (SQLException e) {
			System.out.println("erro ao conectar no banco de dados");
		}
		return connection;
	}
	
	
}
