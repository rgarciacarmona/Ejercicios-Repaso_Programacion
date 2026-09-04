package es.upm.dit.repaso.ej410;

import java.text.Normalizer;
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

		System.out.println("¿Es palíndroma? " + esPalindromo(texto));
	}

	// Verifica si es palíndroma (sin tildes, espacios ni mayúsculas).
	private static boolean esPalindromo(String texto) {
		if (texto == null) {
			return false;
		}

		// Quita tildes, espacios y mayúsculas para que "dábale arroz a la zorra
		// el abad" se compare como "dabalearrozalazorraelabad".
		// NFD separa cada letra de su tilde ("á" -> "a" + "´") y \p{M} borra la tilde
		String limpio = Normalizer.normalize(texto, Normalizer.Form.NFD)
				.replaceAll("\\p{M}", "")
				.replaceAll("\\s", "")
				.toLowerCase();

		// Compara con su inverso
		String inverso = new StringBuilder(limpio).reverse().toString();

		return limpio.equals(inverso);
	}
}
