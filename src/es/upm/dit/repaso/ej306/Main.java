package es.upm.dit.repaso.ej306;

/**
 * Ejercicio 3.6: dada una matriz de floats (fila, columna), devuelve
 * un array con el valor máximo de cada fila.
 */
public class Main {

	public static void main(String[] args) {
		float[][] matriz = {
				{ 1.0f, 5.5f, 3.2f },
				{ 8.1f, 2.0f, 4.4f },
				{ -1.0f, -5.0f, -3.0f }
		};
		float[] maximos = maximosPorFila(matriz);
		for (int i = 0; i < maximos.length; i++) {
			System.out.println("Máximo fila " + i + ": " + maximos[i]);
		}
	}

	// Devuelve el máximo de cada fila de 'matriz'. Array vacío si es null.
	private static float[] maximosPorFila(float[][] matriz) {
		if (matriz == null) {
			return new float[0];
		}
		float[] maximos = new float[matriz.length];
		for (int fila = 0; fila < matriz.length; fila++) {
			maximos[fila] = maximoFila(matriz[fila]);
		}
		return maximos;
	}

	// Devuelve el máximo de una fila. Asume la fila con al menos un elemento.
	private static float maximoFila(float[] fila) {
		float maximo = fila[0];
		for (int col = 1; col < fila.length; col++) {
			if (fila[col] > maximo) {
				maximo = fila[col];
			}
		}
		return maximo;
	}
}
