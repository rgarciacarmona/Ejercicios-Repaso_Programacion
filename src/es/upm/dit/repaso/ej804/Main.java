package es.upm.dit.repaso.ej804;

import java.util.Scanner;

/** Ejercicio 8.4: pide enteros por teclado, repitiendo la petición si la entrada no es válida. */
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = pedirEntero(teclado, "Introduce un número entero: ");
		System.out.println("Número leído: " + numero);

		teclado.close();
	}

	// Pide un entero repitiendo la petición hasta que la entrada sea válida.
	private static int pedirEntero(Scanner teclado, String mensaje) {
		while (true) {
			System.out.print(mensaje);
			String texto = teclado.nextLine();

			try {
				return Integer.parseInt(texto);
			} catch (NumberFormatException e) {
				System.out.println("Eso no es un número entero. Por favor, vuelve a introducirlo.");
			}
		}
	}
}
