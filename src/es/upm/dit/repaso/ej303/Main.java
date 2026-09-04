package es.upm.dit.repaso.ej303;

/**
 * Ejercicio 3.3: genera un array de 300 enteros donde cada posición
 * contiene su índice módulo 16 (secuencia 0..15 repetida).
 */
public class Main {

	private static final int TAMANIO = 300;
	private static final int MODULO = 16;

	public static void main(String[] args) {
		int[] datos = generar();
		for (int i = 0; i < datos.length; i++) {
			System.out.print(datos[i] + " ");
		}
		System.out.println();
	}

	// Genera el array con la secuencia 0..15 repetida.
	private static int[] generar() {
		int[] datos = new int[TAMANIO];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = i % MODULO;
		}
		return datos;
	}
}
