package es.upm.dit.repaso.ej311;

import java.util.Scanner;

/**
 * Ejercicio 3.11: lee enteros por teclado hasta introducir 0 y calcula
 * la media, el mínimo y el máximo de los datos introducidos (sin el 0 final).
 */
public class Main {

	private static final int CENTINELA = 0;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce enteros (0 para terminar):");
		procesar(teclado);
		teclado.close();
	}

	// Lee números hasta el centinela y muestra media, mínimo y máximo.
	private static void procesar(Scanner teclado) {
		int cantidad = 0;
		long suma = 0;
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;

		while (teclado.hasNextInt()) {
			int numero = teclado.nextInt();
			if (numero == CENTINELA) {
				break;
			}
			cantidad++;
			suma += numero;
			minimo = Math.min(minimo, numero);
			maximo = Math.max(maximo, numero);
		}

		if (cantidad == 0) {
			System.out.println("No se introdujeron datos.");
			return;
		}
		System.out.println("Media: " + ((double) suma / cantidad));
		System.out.println("Mínimo: " + minimo);
		System.out.println("Máximo: " + maximo);
	}
}
