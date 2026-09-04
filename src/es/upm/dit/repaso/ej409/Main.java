package es.upm.dit.repaso.ej409;

/**
 * Ejercicio 4.9: escribe una cadena al revés.
 */
public class Main {

	public static void main(String[] args) {
		String texto = "Hola Mundo";
		String invertido = invertir(texto);
		System.out.println("Original: " + texto);
		System.out.println("Invertido: " + invertido);
	}

	// Invierte un String.
	private static String invertir(String texto) {
		if (texto == null) {
			return null;
		}
		return new StringBuilder(texto).reverse().toString();
	}
}
