package Interface;

@FunctionalInterface
public interface Conta {
	void transacao();
	//void calcular();
	default void investimento() {
		System.out.println("rodou o default");
	}
}
