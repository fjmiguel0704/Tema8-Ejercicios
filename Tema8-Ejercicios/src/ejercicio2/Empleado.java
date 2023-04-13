package ejercicio2;

public class Empleado {
	/**
	 * Nombre del empleado
	 */
	private String nombre;

	/**
	 * Constructor por defecto
	 */
	public Empleado() {

	}

	/**
	 * Constructor que asigna valor al nombre del empleado
	 * 
	 * @param nombre
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el nombre del empleado
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del empleado
	 * 
	 * @param nombre a asignar al empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Imprime el nombre del empleado
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
