package es.upm.dit.repaso.ej407;

/**
 * Ejercicio 4.7: verifica si un String es número decimal válido.
 * Acepta puntos o comas como separador decimal (pero no ambos).
 */
public class Main {

	public static void main(String[] args) {
		String[] ejemplos = {"123", "12.34", "12,34", "12.34,56", "abc", "-5.5", "+3.14", ".", ","};

		for (String ejemplo : ejemplos) {
			boolean valido = esNumeroDecimal(ejemplo);
			System.out.println("'" + ejemplo + "' es número decimal: " + valido);
		}
	}

	// Verifica si es un número decimal válido: signo opcional, al menos un dígito
	// y como mucho un separador, punto o coma (por eso "12.34,56" no vale).
	private static boolean esNumeroDecimal(String texto) {
		if (texto == null || texto.isEmpty()) {
			return false;
		}

		// El signo, si lo hay, solo puede ir al principio
		char primero = texto.charAt(0);
		int inicio = 0;
		if (primero == '+' || primero == '-') {
			inicio = 1;
		}

		boolean tieneSeparador = false;
		int digitos = 0;

		for (int i = inicio; i < texto.length(); i++) {
			char c = texto.charAt(i);

			if (c == '.' || c == ',') {
				if (tieneSeparador) {
					return false;
				}
				tieneSeparador = true;
			} else if (Character.isDigit(c)) {
				digitos++;
			} else {
				return false;
			}
		}

		// Sin dígitos no hay número: "-", "." o "," no son válidos
		return digitos > 0;
	}
}
