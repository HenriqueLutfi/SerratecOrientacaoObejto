package Exercicio01Livraria;

public class TesteLivraria {

	public static void main(String[] args) {
		Livro livro = new Livro("marcos","hahaha",100);
		Livro livro1 = new Livro("kathy","lalala",100);
		Operacao operacao = new Operacao("compra",1.09,livro);
		Operacao operacao1 = new Operacao("emprestimo",1.02,livro1);
		
		livro.reajuste(0.06);
		System.out.println("valor com reajuste:" + livro.getValor());
		operacao.venderLivro();
		operacao1.emprestarLivro();
		System.out.println(operacao.toString());
		System.out.println(operacao1.toString());
		
	}

}
