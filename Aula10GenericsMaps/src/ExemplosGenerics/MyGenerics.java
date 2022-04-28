package ExemplosGenerics;
//<t> = tipo
public class MyGenerics <T>{
	private T valor;
	
	public MyGenerics(T valor) {
		super();
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "MyGenerics [valor=" + valor + "]";
	}
	
}
