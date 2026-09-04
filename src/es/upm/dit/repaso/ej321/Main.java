package es.upm.dit.repaso.ej321;

/**
 * Ejercicio 3.21: cuenta elementos a más de 2 desviaciones típicas de la media.
 */
public class Main {

	private static final int DESVIACIONES = 2;

	public static void main(String[] args) {
		float[] datos = { 10f, 12f, 11f, 9f, 50f, 10f, 8f, -30f, 11f };
		int cantidad = contarAlejados(datos);
		System.out.println("Elementos alejados: " + cantidad);
	}

	// Cuenta los valores cuya distancia a la media supera 2 desviaciones típicas.
	private static int contarAlejados(float[] datos) {
		if (datos == null || datos.length == 0) {
			return 0;
		}

		float media = media(datos);
		float desviacion = desviacionTipica(datos, media);

		int cantidad = 0;
		for (float valor : datos) {
			if (Math.abs(valor - media) > DESVIACIONES * desviacion) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private static float media(float[] datos) {
		float suma = 0f;
		for (float valor : datos) {
			suma += valor;
		}
		return suma / datos.length;
	}

	private static float desviacionTipica(float[] datos, float media) {
		float sumaCuadrados = 0f;
		for (float valor : datos) {
			sumaCuadrados += (valor - media) * (valor - media);
		}
		return (float) Math.sqrt(sumaCuadrados / datos.length);
	}
}
