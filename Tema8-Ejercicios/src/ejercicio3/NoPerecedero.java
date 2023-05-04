package ejercicio3;

public class NoPerecedero extends Productos {
	/**
	 * Guardará el tipo de comida que no caduca
	 */
	String tipo;

	/**
	 * Constructor que asigna valores a nombre, precio y tipo de producto no
	 * perecedero
	 * 
	 * @param nombre del producto
	 * @param precio del producto
	 * @param tipo   de producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * Obtiene y devuelve el tipo de producto no perecedero
	 * 
	 * @return el tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Modifica el tipo de producto no perecedero
	 * 
	 * @param tipo de producto no perecedero a modificar
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método que devuelve el resultado de multiplicar el precio por la cantidad de
	 * productos
	 */
	double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	/**
	 * Método que devuelve el nombre, precio y tipo de producto no perecedero
	 */
	@Override
	public String toString() {
		return super.toString() + ", Tipo=" + tipo;
	}

}
