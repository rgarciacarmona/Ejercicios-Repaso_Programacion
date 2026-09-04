package es.upm.dit.repaso.ej407;

/**
 * Ejercicio 4.7: verifica si un String es número decimal válido.
 * Acepta puntos o comas como separador decimal (pero no ambos).
 */
public class Main {

	public static void main(String[] args) {
		String[] ejemplos = {"123", "12.34", "12,34", "12.34,56", "abc", "-5.5", "+3.14"};

		for (String ejemplo : ejemplos) {
			boolean valido = esNumeroDecimal(ejemplo);
			System.out.println("'" + ejemplo + "' es número decimal: " + valido);
		}
	}

	// Verifica si es un número decimal válido (con . o , como separador, no ambos).
	private static boolean esNumeroDecimal(String texto) {
		if (texto == null || texto.isEmpty()) {
			return false;
		}

		boolean tienePunto = false;
		boolean tieneComma = false;

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);

			if (c == '.') {
				if (tienePunto || tieneComma) {
					return false;
				}
				tienePunto = true;
			} else if (c == ',') {
				if (tieneComma || tienePunto) {
					return false;
				}
				tieneComma = true;
			} else if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;
	}
}
