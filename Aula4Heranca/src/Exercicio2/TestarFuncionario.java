package Exercicio2;

public class TestarFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("haha",1000);
		Gerente gerente = new Gerente("caca",1000,"lala");
		Assistente assistente = new Assistente("fafa",1000,100);
		
		System.out.println(funcionario.aumentarSalario());	
		System.out.println(gerente.aumentarSalario());	
		System.out.println(assistente.aumentarSalario());	
		
	}
}
