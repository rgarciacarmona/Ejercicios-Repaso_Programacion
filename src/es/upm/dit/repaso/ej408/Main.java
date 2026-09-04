package es.upm.dit.repaso.ej408;

/**
 * Ejercicio 4.8: cuenta vocales en un String
 * (con y sin tilde, mayúsculas y minúsculas).
 */
public class Main {

	public static void main(String[] args) {
		String texto = "Áéíóú aeiouAEIOUñÑ";
		int vocales = contarVocales(texto);
		System.out.println("Texto: '" + texto + "'");
		System.out.println("Vocales (con tilde): " + vocales);
	}

	// Cuenta vocales con y sin tilde, mayúsculas y minúsculas.
	private static int contarVocales(String texto) {
		if (texto == null) {
			return 0;
		}

		int veces = 0;
		String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";

		for (int i = 0; i < texto.length(); i++) {
			if (vocales.indexOf(texto.charAt(i)) != -1) {
				veces++;
			}
		}

		return veces;
	}
}
