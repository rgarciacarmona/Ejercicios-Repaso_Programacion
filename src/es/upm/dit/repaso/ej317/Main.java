package es.upm.dit.repaso.ej317;

/**
 * Ejercicio 3.17: filtra un array de floats por un umbral mínimo.
 */
public class Main {

	public static void main(String[] args) {
		float[] datos = { 1.5f, 4.2f, 0.3f, 7.8f, 2.1f };
		float[] filtrado = filtrarPorUmbral(datos, 2f);
		for (float valor : filtrado) {
			System.out.println(valor);
		}
	}

	// Devuelve solo los elementos que superan el umbral dado.
	private static float[] filtrarPorUmbral(float[] datos, float umbral) {
		if (datos == null || datos.length == 0) {
			return new float[0];
		}

		int cantidad = 0;
		for (float valor : datos) {
			if (valor > umbral) {
				cantidad++;
			}
		}

		float[] filtrado = new float[cantidad];
		int pos = 0;
		for (float valor : datos) {
			if (valor <= umbral) {
				continue;
			}
			filtrado[pos] = valor;
			pos++;
		}
		return filtrado;
	}
}
