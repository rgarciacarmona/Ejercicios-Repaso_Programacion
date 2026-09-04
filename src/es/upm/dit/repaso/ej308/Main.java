package es.upm.dit.repaso.ej308;

/**
 * Ejercicio 3.8: cuenta el número de valores negativos en un array de floats.
 */
public class Main {

	public static void main(String[] args) {
		float[] datos = { 1.5f, -2.5f, 0.0f, -1.0f, 4.25f, -0.1f };
		int negativos = contarNegativos(datos);
		System.out.println("Negativos: " + negativos);
	}

	// Cuenta los valores negativos de 'datos'. Devuelve 0 si es null.
	private static int contarNegativos(float[] datos) {
		if (datos == null) {
			return 0;
		}
		int contador = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] < 0) {
				contador++;
			}
		}
		return contador;
	}
}
