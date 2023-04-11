package ejercicio1;

public class HoraExacta extends Hora {
	int segundo=0;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo=segundo;	
	}
	
	void setSegundo(int valor){
		if (valor>=0&&valor<=59) {
			segundo+=valor;
		}
	}
	
	void inc(){	
		segundo++;
		if (segundo==60) {
			super.inc();
			segundo=0;
		}
	}


	public String toString() {
		String cadena = super.toString();
		if (segundo<10) {
			cadena+=":"+"0"+segundo;
		} else {
			cadena+=":"+segundo;
		}

		return cadena;
	}
	
	

}
