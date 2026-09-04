package es.upm.dit.repaso.ej406;

/**
 * Ejercicio 4.6: intercambia puntos y comas en una sola pasada.
 */
public class Main {

	public static void main(String[] args) {
		String texto = "Precio: 10.50, descuento: 2.30, total: 8.20.";
		String resultado = intercambiar(texto);
		System.out.println("Original: " + texto);
		System.out.println("Intercambiado: " + resultado);
	}

	// Intercambia puntos por comas y comas por puntos en una sola pasada.
	private static String intercambiar(String texto) {
		if (texto == null) {
			return texto;
		}

		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == '.') {
				resultado.append(',');
			} else if (c == ',') {
				resultado.append('.');
			} else {
				resultado.append(c);
			}
		}

		return resultado.toString();
	}
}
