package ejercicio2;

public class Operario extends Empleado {
	/**
	 * Constructor que asigna valor al nombre del empleado operario
	 * 
	 * @param nombre del operario
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Imprime el nombre del operario
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}

}
