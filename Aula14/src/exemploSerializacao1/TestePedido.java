package exemploSerializacao1;

public class TestePedido {
	 public static void main(String[] args) {
	        Pedido pedido = new Pedido();
	        pedido.FinalizarPedido();

	        System.out.println("-------------------------------------------");
	        System.out.println("---------------Classe Anônima-------------");

	        Pedido pedido2 = new Pedido() {
	            @Override 
	            public void FinalizarPedido() {
	                System.out.println("Pedido encerrado!");
	            }
	        };
	        pedido2.FinalizarPedido();

	    }
}
