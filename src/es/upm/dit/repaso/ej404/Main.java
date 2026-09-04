package es.upm.dit.repaso.ej404;

/**
 * Ejercicio 4.4: convierte a mayúsculas y minúsculas.
 */
public class Main {

	public static void main(String[] args) {
		String texto = "Hola Mundo";
		String mayusculas = texto.toUpperCase();
		String minusculas = texto.toLowerCase();

		System.out.println("Original: " + texto);
		System.out.println("Mayúsculas: " + mayusculas);
		System.out.println("Minúsculas: " + minusculas);
	}
}
