package es.upm.dit.repaso.ej310;

/**
 * Ejercicio 3.10: invierte el orden de los elementos de un array de chars
 * in-place, sin usar arrays auxiliares.
 */
public class Main {

	public static void main(String[] args) {
		char[] datos = { 'h', 'o', 'l', 'a' };
		invertir(datos);
		System.out.println(new String(datos));
	}

	// Invierte 'datos' in-place intercambiando extremos hacia el centro.
	private static void invertir(char[] datos) {
		if (datos == null) {
			return;
		}
		int izquierda = 0;
		int derecha = datos.length - 1;
		while (izquierda < derecha) {
			char temporal = datos[izquierda];
			datos[izquierda] = datos[derecha];
			datos[derecha] = temporal;
			izquierda++;
			derecha--;
		}
	}
}
