package es.upm.dit.repaso.ej306;

/**
 * Ejercicio 3.6: dada una matriz de floats (fila, columna), devuelve
 * un array con el valor máximo de cada fila.
 */
public class Main {

	public static void main(String[] args) {
		// La última fila está vacía a propósito: en Java una matriz es un array de
		// arrays, así que cada fila se crea por separado y puede tener una
		// longitud distinta, incluso 0
		float[][] matriz = {
				{ 1.0f, 5.5f, 3.2f },
				{ 8.1f, 2.0f, 4.4f },
				{ -1.0f, -5.0f, -3.0f },
				{}
		};
		// Imprime NaN si la fila no tiene máximo por estar vacía
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

	// Devuelve el máximo de una fila.
	//
	// Caso límite fácil de pasar por alto: una fila puede estar vacía o ser null,
	// y entonces no hay ningún máximo. Empezar directamente por
	// "float maximo = fila[0]" rompería el programa con
	// ArrayIndexOutOfBoundsException o NullPointerException.
	//
	// Un float siempre vale algo, no puede ser null, así que para avisar de que
	// no hay máximo se usa NaN ("not a number", el resultado de 0.0f / 0.0f).
	private static float maximoFila(float[] fila) {
		if (fila == null || fila.length == 0) {
			return Float.NaN;
		}

		float maximo = fila[0];
		for (int col = 1; col < fila.length; col++) {
			if (fila[col] > maximo) {
				maximo = fila[col];
			}
		}
		return maximo;
	}
}
