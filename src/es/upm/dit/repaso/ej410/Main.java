package es.upm.dit.repaso.ej410;

import java.text.Normalizer;
import java.util.Scanner;

/**
 * Ejercicio 4.10: verifica si una cadena es palíndroma
 * (ignora espacios y mayúsculas/minúsculas).
 */
public class Main {

	// Lo que NFD deja donde había una "ñ": una "n" y la tilde suelta
	private static final String ENE_NFD = "n\u0303";

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
		// NFD separa cada letra de su tilde ("á" -> "a" + "´") y \p{M} borra la tilde.
		// La "ñ" no es una "n" con tilde, sino otra letra, así que se rehace antes
		// de borrarlas: si no, "cañón" se compararía como "canon"
		String limpio = Normalizer.normalize(texto.toLowerCase(), Normalizer.Form.NFD)
				.replace(ENE_NFD, "ñ")
				.replaceAll("\\p{M}", "")
				.replaceAll("\\s", "");

		// Compara con su inverso
		String inverso = new StringBuilder(limpio).reverse().toString();

		return limpio.equals(inverso);
	}
}
