package ejercicio2;

public class Tecnico extends Operario {
	/**
	 * Constructor que asigna valor al nombre del empleado operario tecnico
	 * 
	 * @param nombre del tecnico
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Imprime el nombre del tecnico
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
