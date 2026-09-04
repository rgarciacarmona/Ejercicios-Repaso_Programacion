package es.upm.dit.repaso.ej319;

/**
 * Ejercicio 3.19: submuestrea un array de ints conservando 1 de cada N muestras.
 */
public class Main {

	public static void main(String[] args) {
		int[] muestras = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int[] resultado = submuestrear(muestras, 3);
		for (int valor : resultado) {
			System.out.println(valor);
		}
	}

	// Conserva una muestra de cada "nivel", empezando por la primera.
	private static int[] submuestrear(int[] muestras, int nivel) {
		if (muestras == null || nivel <= 0) {
			return new int[0];
		}

		int cantidad = (muestras.length + nivel - 1) / nivel;
		int[] resultado = new int[cantidad];
		int pos = 0;
		for (int i = 0; i < muestras.length; i += nivel) {
			resultado[pos] = muestras[i];
			pos++;
		}
		return resultado;
	}
}
