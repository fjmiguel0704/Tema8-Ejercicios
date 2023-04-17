package ejercicio3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Productos [] productos = new Productos [10];

	productos[0]=new NoPerecedero("Galletas",2.15, "Maria");
	productos[2] = new NoPerecedero("Aceite", 5.99, "Girasol");
	productos[3] = new NoPerecedero("Leche", 2.99, "Entera");
	productos[4] = new NoPerecedero("Cacao", 6.99, "En Polvo");
	productos[5] = new Perecedero("Yogur", 0.99, 32);
	productos[6] = new Perecedero("Mantequilla", 2.99, 50);
	productos[7] = new Perecedero("Tomate", 1.99, 20);
	productos[8] = new Perecedero("Mermelada", 2.99, 15);
	productos[9] = new Perecedero("Sopa", 0.95, 70);
	
	
	//System.out.println(Arrays.toString(productos));
	for (Productos valores : productos) {
		System.out.println(valores);
	}

}}