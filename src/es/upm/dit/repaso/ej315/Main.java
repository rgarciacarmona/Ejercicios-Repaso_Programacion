package es.upm.dit.repaso.ej315;

/**
 * Ejercicio 3.15: extrae los máximos locales de un array de floats.
 */
public class Main {

	public static void main(String[] args) {
		float[] datos = { 1f, 5f, 2f, 8f, 3f, 3f, 9f, 1f };
		float[] maximos = maximosLocales(datos);
		for (float valor : maximos) {
			System.out.println(valor);
		}
	}

	// Un elemento es máximo local si supera a su vecino anterior y al posterior.
	private static float[] maximosLocales(float[] datos) {
		if (datos == null || datos.length < 3) {
			return new float[0];
		}

		int cantidad = 0;
		for (int i = 1; i < datos.length - 1; i++) {
			if (datos[i] > datos[i - 1] && datos[i] > datos[i + 1]) {
				cantidad++;
			}
		}

		float[] maximos = new float[cantidad];
		int pos = 0;
		for (int i = 1; i < datos.length - 1; i++) {
			if (datos[i] > datos[i - 1] && datos[i] > datos[i + 1]) {
				maximos[pos] = datos[i];
				pos++;
			}
		}
		return maximos;
	}
}
