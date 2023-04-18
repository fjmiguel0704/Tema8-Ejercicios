package ejercicio3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int cantProd=5;
		double suma=0;
		double sumaCalcular;
		Productos[] productos = new Productos[10];

		productos[0] = new NoPerecedero("Galletas", 2.15, "Maria");
		productos[1] = new NoPerecedero("Café", 4.5, "Mocca");
		productos[2] = new NoPerecedero("Aceite", 5.99, "Girasol");
		productos[3] = new NoPerecedero("Leche", 2.99, "Entera");
		productos[4] = new NoPerecedero("Cacao", 6.99, "En Polvo");
		productos[5] = new Perecedero("Yogur", 0.99, 2);
		productos[6] = new Perecedero("Mantequilla", 2.99, 1);
		productos[7] = new Perecedero("Tomate", 1.99, 2);
		productos[8] = new Perecedero("Mermelada", 2.99, 3);
		productos[9] = new Perecedero("Sopa", 0.95, 3);

		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i]+" ");
			System.out.println();
			sumaCalcular=productos[i].calcular(cantProd);
			System.out.println("Precio final: " +  sumaCalcular);
			System.out.println("--------------------------------------------------");
			suma+=sumaCalcular;
		}

		System.out.println();
		System.out.println("Suma total de productos: " + suma);

	}
}