package es.upm.dit.repaso.ej402;

/**
 * Ejercicio 4.2: cuenta cuántas veces aparece un char en un String.
 */
public class Main {

	public static void main(String[] args) {
		String texto = "programacion";
		char buscado = 'a';
		int veces = contar(texto, buscado);
		System.out.println("'" + buscado + "' aparece " + veces + " veces.");
	}

	// Cuenta las apariciones de un char en un String.
	private static int contar(String texto, char buscado) {
		if (texto == null) {
			return 0;
		}
		int veces = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == buscado) {
				veces++;
			}
		}
		return veces;
	}
}
