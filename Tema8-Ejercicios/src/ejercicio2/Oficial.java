package ejercicio2;

public class Oficial extends Operario {
	/**
	 * Constructor que asigna valor al nombre del empleado operario oficial
	 * 
	 * @param nombre del oficial
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * Imprime el nombre del oficial
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
