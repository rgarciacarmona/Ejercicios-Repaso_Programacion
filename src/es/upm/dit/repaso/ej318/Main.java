package es.upm.dit.repaso.ej318;

/**
 * Ejercicio 3.18: calcula la media móvil de un array de floats.
 */
public class Main {

	public static void main(String[] args) {
		float[] datos = { 1f, 2f, 3f, 4f, 5f, 6f };
		float[] medias = mediaMovil(datos, 3);
		for (float valor : medias) {
			System.out.println(valor);
		}
	}

	// Media de cada elemento junto a los (ventana - 1) anteriores.
	// El resultado tiene tamaño = datos.length - (ventana - 1).
	private static float[] mediaMovil(float[] datos, int ventana) {
		if (datos == null || ventana <= 0 || datos.length < ventana) {
			return new float[0];
		}

		float[] medias = new float[datos.length - ventana + 1];
		for (int i = 0; i < medias.length; i++) {
			float suma = 0f;
			for (int j = i; j < i + ventana; j++) {
				suma += datos[j];
			}
			medias[i] = suma / ventana;
		}
		return medias;
	}
}
