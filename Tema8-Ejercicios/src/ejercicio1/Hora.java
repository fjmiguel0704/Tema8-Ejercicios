package ejercicio1;

public class Hora {
	int hora=0;
	int minuto=0;

	public Hora(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}

	void inc() {
		minuto++;
		if (minuto == 60) {
			hora++;
			minuto = 0;
		}
	}

	boolean setMinutos(int valor) {
		boolean estado = false;
		if (valor > 0) {
			estado = true;
		}

		return estado;
	}

	boolean setHora(int valor) {
		boolean estado = false;
		if (valor >= 0 && valor <= 23) {
			estado = true;
		}

		return estado;
	}

	public String toString() {
		String result = "";
		if (hora < 10) {
			result = "0" + hora + ":" + minuto;
		} 
		if (minuto < 10) {
			result = hora + ":" + "0" + minuto;
		} 
		if (hora < 10 && minuto < 10) {
			result = "0" + hora + ":" + "0" + minuto;
		} else {
			result = hora + ":" + minuto;
		}
		return result;
	}
}
