package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactorySingleton {
	private static String urlConexao = "jdbc:postgresql://localhost:5432/testebd";
	private static String usuario = "postgres";
	private static String senha = "Po22375606!";
	private static Connection connection;

	// padrao singleton - somente uma unica conexao
	private static Connection newConnection() {
		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			System.out.println("conectado com sucesso");
		} catch (Exception e) {
			System.out.println("nao foi possivel conectar");
		}
		return connection;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
		}

		return connection;
	}

}
