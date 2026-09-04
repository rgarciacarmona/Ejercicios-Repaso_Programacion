package es.upm.dit.repaso.ej403;

/**
 * Ejercicio 4.3: elimina espacios en blanco al final de un String.
 */
public class Main {

	public static void main(String[] args) {
		String texto = "hola mundo   \t ";
		String resultado = eliminarEspaciosFinal(texto);
		System.out.println("Original: '" + texto + "'");
		System.out.println("Sin espacios al final: '" + resultado + "'");
	}

	// Elimina espacios en blanco solo al final del String.
	private static String eliminarEspaciosFinal(String texto) {
		if (texto == null || texto.isEmpty()) {
			return texto;
		}

		int fin = texto.length() - 1;
		while (fin >= 0 && Character.isWhitespace(texto.charAt(fin))) {
			fin--;
		}

		return texto.substring(0, fin + 1);
	}
}
