package es.upm.dit.repaso.ej302;

/**
 * Ejercicio 3.2: busca un valor en un array de ints (no ordenado)
 * y devuelve su posición, o -1 si no existe.
 */
public class Main {

	public static void main(String[] args) {
		int[] datos = { 7, 3, 9, 1, 5, 3 };
		System.out.println("Posición de 5: " + buscar(datos, 5));
		System.out.println("Posición de 8: " + buscar(datos, 8));
	}

	// Busca 'valor' en 'datos'. Devuelve -1 si no está o si 'datos' es null.
	private static int buscar(int[] datos, int valor) {
		if (datos == null) {
			return -1;
		}
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] == valor) {
				return i;
			}
		}
		return -1;
	}
}
