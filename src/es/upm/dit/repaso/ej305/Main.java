package es.upm.dit.repaso.ej305;

/**
 * Ejercicio 3.5: calcula el promedio de los elementos de un array de floats.
 */
public class Main {

	public static void main(String[] args) {
		float[] datos = { 1.5f, 2.5f, 3.0f, -1.0f, 4.25f };
		float media = promedio(datos);
		System.out.println("Promedio: " + media);
	}

	// Calcula el promedio de 'datos'. Devuelve 0 si es null o vacío.
	private static float promedio(float[] datos) {
		if (datos == null || datos.length == 0) {
			return 0;
		}
		float suma = 0;
		for (int i = 0; i < datos.length; i++) {
			suma += datos[i];
		}
		return suma / datos.length;
	}
}
