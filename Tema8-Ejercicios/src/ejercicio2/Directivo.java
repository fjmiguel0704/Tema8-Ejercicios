package ejercicio2;

public class Directivo extends Empleado {
	/**
	 * Constructor que asigna valor al nombre del empleado directivo
	 * 
	 * @param nombre del directivo
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Imprime el nombre del directivo
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}
