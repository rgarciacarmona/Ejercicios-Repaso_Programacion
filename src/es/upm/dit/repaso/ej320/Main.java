package es.upm.dit.repaso.ej320;

/**
 * Ejercicio 3.20: interpola un array de ints insertando la media entre cada par.
 */
public class Main {

	public static void main(String[] args) {
		int[] muestras = { 10, 20, 40, 70 };
		int[] resultado = interpolar(muestras);
		for (int valor : resultado) {
			System.out.println(valor);
		}
	}

	// Entre cada dos muestras consecutivas inserta la media de ambas.
	private static int[] interpolar(int[] muestras) {
		if (muestras == null || muestras.length == 0) {
			return new int[0];
		}
		if (muestras.length == 1) {
			return muestras.clone();
		}

		int[] resultado = new int[muestras.length * 2 - 1];
		for (int i = 0; i < muestras.length; i++) {
			resultado[i * 2] = muestras[i];
			if (i < muestras.length - 1) {
				resultado[i * 2 + 1] = (muestras[i] + muestras[i + 1]) / 2;
			}
		}
		return resultado;
	}
}
