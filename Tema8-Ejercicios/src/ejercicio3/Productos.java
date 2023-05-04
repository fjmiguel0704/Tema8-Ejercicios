package ejercicio3;

public class Productos {
	/**
	 * Guardará el nombre del producto
	 */
	String nombre;

	/**
	 * Guardará el precio del producto
	 */
	double precio;

	/**
	 * Constructor por defecto
	 */
	public Productos() {

	}

	/**
	 * Constructor que asigna valores a nombre y precio del producto
	 * 
	 * @param nombre del producto
	 * @param precio del producto
	 */
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Obtiene y devuelve el nombre del producto
	 * 
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del producto
	 * 
	 * @param nombre del producto a modificar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene y devuelve el precio del producto
	 * 
	 * @return el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio del producto
	 * 
	 * @param precio del producto a modificar
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Método que devuelve el resultado de multiplicar el precio por una determinada
	 * cantidad de prodcutos
	 * 
	 * @param cantidad de productos
	 * @return resultado de precio por cantidad
	 */
	double calcular(int cantidad) {
		double result;
		result = precio * cantidad;
		return result;
	}

	/**
	 * Método que devuelve el nombre y precio del producto como cadena
	 */
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Precio=" + precio;
	}

}
