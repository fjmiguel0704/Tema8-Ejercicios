package ejercicio3;

public class Perecedero extends Productos {
	/**
	 * Guardará el tiempo de días a caducar del producto
	 */
	int diasCaducar;

	/**
	 * Constructor que asigna valores a nombre, precio y dias a caducar del producto
	 * 
	 * @param nombre      del producto
	 * @param precio      del producto
	 * @param diasCaducar del producto
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	/**
	 * Obtiene y devuelve los dias a caducar
	 * 
	 * @return los días a caducar
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * Modifica la cantidad de dias a caducar del producto
	 * 
	 * @param diasCaducar del producto a modificar
	 */
	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	/**
	 * Método que devuelve el resultado final del precio según los días a caducar
	 * restantes
	 */
	double calcular(int cantidad) {
		double result = super.calcular(cantidad);

		if (diasCaducar == 1) {
			result /= 4;
		}
		if (diasCaducar == 2) {
			result /= 3;
		}
		if (diasCaducar == 3) {
			result /= 2;
		}

		return result;
	}

	/**
	 * Método que devuelve el nombre, precio y dias a caducar de un producto por
	 * cadena
	 */
	@Override
	public String toString() {
		return super.toString() + ", Dias a caducar=" + diasCaducar;
	}

}
