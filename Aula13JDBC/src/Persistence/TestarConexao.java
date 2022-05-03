package Persistence;

import java.sql.Connection;

public class TestarConexao {

	public static void main(String[] args) {
		//por ser static nao precisa ser new
		Connection connection =  ConnectionFactorySingleton.getConnection();
		System.out.println(connection);
		
	
	}

}
