package Persistence;

import java.sql.Connection;
import java.util.Optional;

import Exemplo1Funcionario.Funcionario;

public class FuncionarioDao {
	
	public FuncionarioDao() {
		Connection connection = ConnectionFactorySingleton.getConnection();
	}
	
	public Optional<Funcionario> buscar(String nome) {
		return Optional.ofNullable(null);
	}
}
