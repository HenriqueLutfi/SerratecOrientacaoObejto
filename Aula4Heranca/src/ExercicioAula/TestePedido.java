package ExercicioAula;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123,LocalDate.of(2022,04,12),4,12.0);
		Pedido pedido2 = new Pedido(123,LocalDate.of(2022,04,12),4,10.0);
		Pedido pedido3 = new Pedido(123,LocalDate.now(),4,100.0);
		
		System.out.println(pedido1.finalizarPedido());
		System.out.println(pedido2.finalizarPedido());
		System.out.println(pedido3.finalizarPedido());
		System.out.println(Pedido.getTotalPedido());
	}
	
}
