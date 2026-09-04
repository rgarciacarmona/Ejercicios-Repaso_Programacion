package es.upm.dit.repaso.ej307;

/**
 * Ejercicio 3.7: copia un array de ints a otro, multiplicando cada
 * valor por un factor fijo.
 */
public class Main {

	public static void main(String[] args) {
		int[] origen = { 1, 2, 3, 4, 5 };
		int[] destino = copiarMultiplicando(origen, 3);
		for (int i = 0; i < destino.length; i++) {
			System.out.print(destino[i] + " ");
		}
		System.out.println();
	}

	// Copia 'origen' multiplicando cada valor por 'factor'. Array vacío si es null.
	private static int[] copiarMultiplicando(int[] origen, int factor) {
		if (origen == null) {
			return new int[0];
		}
		int[] destino = new int[origen.length];
		for (int i = 0; i < origen.length; i++) {
			destino[i] = origen[i] * factor;
		}
		return destino;
	}
}
