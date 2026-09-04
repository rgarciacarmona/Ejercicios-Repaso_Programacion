package es.upm.dit.repaso.ej405;

/**
 * Ejercicio 4.5: cuenta apariciones de una subcadena en un String.
 * Nota: sin solaparse (ej. "aa" en "aaa" = 1, no 2).
 */
public class Main {

	public static void main(String[] args) {
		String texto = "abcabcabc";
		String subcadena = "abc";
		int veces = contar(texto, subcadena);
		System.out.println("'" + subcadena + "' aparece " + veces + " veces.");
	}

	// Cuenta apariciones de subcadena sin solaparse.
	private static int contar(String texto, String subcadena) {
		if (texto == null || subcadena == null || subcadena.isEmpty()) {
			return 0;
		}

		int veces = 0;
		int pos = 0;
		while ((pos = texto.indexOf(subcadena, pos)) != -1) {
			veces++;
			pos += subcadena.length();
		}

		return veces;
	}
}
