package es.upm.dit.repaso.ej410;

import java.util.Scanner;

/**
 * Ejercicio 4.10: verifica si una cadena es palíndroma
 * (ignora espacios y mayúsculas/minúsculas).
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce una cadena: ");
		String texto = scanner.nextLine();
		scanner.close();

		boolean esLindromo = esPalindromo(texto);
		System.out.println("¿Es palíndroma? " + esLindromo);
	}

	// Verifica si es palíndroma (sin espacios ni mayúsculas).
	private static boolean esPalindromo(String texto) {
		if (texto == null) {
			return false;
		}

		// Elimina espacios y convierte a minúsculas
		String limpio = texto.replaceAll(" ", "").toLowerCase();

		// Compara con su inverso
		String inverso = new StringBuilder(limpio).reverse().toString();

		return limpio.equals(inverso);
	}
}
