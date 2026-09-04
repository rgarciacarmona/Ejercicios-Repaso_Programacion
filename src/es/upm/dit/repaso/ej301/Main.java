package es.upm.dit.repaso.ej301;

/**
 * Ejercicio 3.1: suma todos los elementos de un array de floats.
 */
public class Main {

	public static void main(String[] args) {
		float[] datos = { 1.5f, 2.5f, 3.0f, -1.0f, 4.25f };
		float total = sumar(datos);
		System.out.println("Suma: " + total);
	}

	// Suma los elementos de 'datos'. Devuelve 0 si 'datos' es null o vacío.
	private static float sumar(float[] datos) {
		if (datos == null) {
			return 0;
		}
		float suma = 0;
		for (int i = 0; i < datos.length; i++) {
			suma += datos[i];
		}
		return suma;
	}
}
