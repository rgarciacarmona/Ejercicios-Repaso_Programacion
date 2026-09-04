package es.upm.dit.repaso.ej314;

/**
 * Ejercicio 3.14: normaliza un array de floats entre -1 y 1.
 */
public class Main {

	public static void main(String[] args) {
		float[] datos = { 4f, -8f, 2f, -1f, 6f };
		float[] normalizado = normalizar(datos);
		for (float valor : normalizado) {
			System.out.println(valor);
		}
	}

	// Divide cada valor por el máximo absoluto del array.
	private static float[] normalizar(float[] datos) {
		if (datos == null || datos.length == 0) {
			return new float[0];
		}

		float maximo = 0f;
		for (float valor : datos) {
			float absoluto = Math.abs(valor);
			if (absoluto > maximo) {
				maximo = absoluto;
			}
		}
		if (maximo == 0f) {
			return datos.clone();
		}

		float[] normalizado = new float[datos.length];
		for (int i = 0; i < datos.length; i++) {
			normalizado[i] = datos[i] / maximo;
		}
		return normalizado;
	}
}
