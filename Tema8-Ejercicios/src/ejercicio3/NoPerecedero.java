package ejercicio3;

public class NoPerecedero extends Productos {
	String tipo;

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	double calcular(int cantidad) {
		return super.calcular(cantidad);
	}
	
}
