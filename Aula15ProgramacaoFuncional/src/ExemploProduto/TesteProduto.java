package ExemploProduto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Arroz", 100, LocalDate.of(2022, 4, 1));
		Produto p2 = new Produto(2, "Farinha de Trigo", 30, LocalDate.of(2022, 04, 2));
		Produto p3 = new Produto(3, "Macarrão", 20, LocalDate.of(2022, 4, 3));
		Produto p4 = new Produto(4, "Feijão", 120, LocalDate.of(2022, 5, 4));
		Produto p5 = new Produto(4, "Feijão", 120, LocalDate.of(2022, 5, 4));

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4,p5);
		/*
		 * //sort com copareTo Collections.sort(produtos); System.out.println(produtos);
		 * 
		 * produtos.stream().sorted().forEach(p -> System.out.println(p));
		 */
		
		Comparator<Produto> compareQuantidade = (a, b) -> a.getQuantidadeEstoque().compareTo(b.getQuantidadeEstoque());
		Collections.sort(produtos,compareQuantidade);
		produtos.forEach(p->System.out.println(p));
		System.out.println();
		//ordenando por nome
		/*Comparator<Produto> compareNome = (a, b) -> a.getNome().compareTo(b.getNome());
		Collections.sort(produtos,compareNome);
		produtos.forEach(p->System.out.println(p));*/
		
		produtos.sort((a, b) -> a.getNome().compareTo(b.getNome()));
		produtos.forEach(p-> System.out.println(p));
		
		
		produtos.stream().distinct().filter(p -> p.getNome().equals("Arroz")).forEach(p->System.out.println(p));
		
	}

}
