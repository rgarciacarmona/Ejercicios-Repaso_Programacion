package es.upm.dit.repaso.ej304;

/**
 * Ejercicio 3.4: genera un array de 300 chars con la representación
 * hexadecimal del índice módulo 16 (secuencia 0..9,A..F repetida).
 */
public class Main {

	private static final int TAMANIO = 300;
	private static final int MODULO = 16;

	public static void main(String[] args) {
		char[] datos = generar();
		for (int i = 0; i < datos.length; i++) {
			System.out.print(datos[i]);
		}
		System.out.println();
	}

	// Genera el array con los dígitos hexadecimales 0..F repetidos.
	private static char[] generar() {
		char[] datos = new char[TAMANIO];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = Character.toUpperCase(Character.forDigit(i % MODULO, MODULO));
		}
		return datos;
	}
}
