package Persistence;

import java.util.Optional;

import Exemplo1Funcionario.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();

		Optional<Funcionario> funcionario = dao.buscar("");
		
//	if (funcionario.isPresent()) {
//			System.out.println("resultado: " + funcionario.get().getNome());
//		}
	
		funcionario.ifPresent(f->f.getNome());
		//Optional<Funcionario> f2 = funcionario.orElse(new Funcionario(1,"ana","RH",1500.));
		
	}
}
