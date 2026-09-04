package es.upm.dit.repaso.ej401;

/**
 * Ejercicio 4.1: imprime el primer número que aparezca en un String.
 */
public class Main {

	public static void main(String[] args) {
		String texto = "abc123def456";
		String numero = primerNumero(texto);
		System.out.println("Primer número: " + numero);
	}

	// Busca el primer número (uno o más dígitos) en un String.
	private static String primerNumero(String texto) {
		if (texto == null || texto.isEmpty()) {
			return null;
		}

		StringBuilder numero = new StringBuilder();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (Character.isDigit(c)) {
				numero.append(c);
			} else if (numero.length() > 0) {
				// Ya hemos encontrado dígitos y ahora hay un no-dígito
				break;
			}
		}

		if (numero.length() > 0) {
			return numero.toString();
		}
		return null;
	}
}
