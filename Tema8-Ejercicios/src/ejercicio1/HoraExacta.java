package ejercicio1;

public class HoraExacta extends Hora {
	/**
	 * Guarda los segundos de una hora
	 */
	protected int segundo = 0;

	/**
	 * Constructor que asigna valor a segundos y obtiene de la clase padre la hora y
	 * minutos
	 * 
	 * @param hora    de la hora
	 * @param minuto  de la hora
	 * @param segundo de la hora
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	/**
	 * Este método recibe como parámetro un valor que se le asigna a los segundos en
	 * caso de que sea correcto.
	 * 
	 * @param valor a asignar a los segundos
	 */
	void setSegundo(int valor) {
		if (valor >= 0 && valor <= 59) {
			segundo = valor;
		}
	}

	/**
	 * Método que incrementa los segundos en 1 e incrementa los minutos en 1 en caso
	 * de darse el caso indicado, y resetea los segundos a 0
	 */
	void inc() {
		segundo++;
		if (segundo == 60) {
			super.inc();
			segundo = 0;
		}
	}

	/**
	 * Método que imprime la hora completa con su formato correcto
	 */
	public String toString() {
		String cadena = super.toString();
		if (segundo < 10) {
			cadena += ":" + "0" + segundo;
		} else {
			cadena += ":" + segundo;
		}

		return cadena;
	}

}
