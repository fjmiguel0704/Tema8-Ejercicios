package ejercicio1;

public class Hora {
	/**
	 * Guardará la hora de una hora
	 */
	protected int hora = 0;
	/**
	 * Guardará los minutos de una hora
	 */
	protected int minuto = 0;

	/**
	 * Constructor que asigna valores a horas y minutos
	 * 
	 * @param hora   de la hora
	 * @param minuto de la hora
	 */
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}

	/**
	 * Este método incrementa los minutos en 1 y la hora en 1 en caso de darse el
	 * caso indicado, y resetea los minutos a 0. También comprueba que la hora
	 * siempre esté entre las 0 y las 23
	 */
	void inc() {
		minuto++;
		if (minuto == 60) {
			hora++;
			minuto = 0;
			if (hora > 23) {
				hora = 0;
			}
		}
	}

	/**
	 * Este método recibe como parámetro un valor que se le asigna a los minutos en
	 * caso de que sea correcto. Y devuelve true si lo es y false si no lo es
	 * 
	 * @param valor a asignar a los minutos
	 * @return true o false
	 */
	boolean setMinutos(int valor) {
		boolean estado = false;
		if (valor > 0 && valor < 60) {
			minuto = valor;
			estado = true;
		}

		return estado;
	}

	/**
	 * Este método recibe como parámetro un valor que se le asigna a la hora en caso
	 * de que sea correcto. Y devuelve true si lo es y false si no lo es
	 * 
	 * @param valor a asignar a la hora
	 * @return true o false
	 */
	boolean setHora(int valor) {
		boolean estado = false;
		if (valor >= 0 && valor <= 23) {
			hora = valor;
			estado = true;
		}

		return estado;
	}

	/**
	 * Este método imprime la hora y minutos de una hora con su formato correcto
	 */
	public String toString() {
		String result = "";
		if (hora < 10) {
			result += "0";
		}
		result += hora + ":";

		if (minuto < 10) {
			result += "0";
		}
		result += minuto;

		return result;
	}
}
