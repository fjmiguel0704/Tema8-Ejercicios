package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// Le pasamos al constructor una hora, con su hora, minutos y segundos
		HoraExacta hora = new HoraExacta(23, 9, 2);
		// Modificamos la hora de la hora actual
		hora.setHora(21);
		// Modificamos los minutos de la hora actual
		hora.setMinutos(30);
		// Modificamos los segundos de la hora actual
		hora.setSegundo(58);
		// LLamamos al método que incrementa los segundos de la hora
		hora.inc();
		// Imprimimos la hora final
		System.out.println(hora.toString());

	}

}
