package es.upm.dit.repaso.ej5re07;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re07: copia una List de Integers a otra, multiplicando
 * cada valor por un factor fijo.
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> origen = List.of(1, 2, 3, 4, 5);
		int factor = 10;
		List<Integer> copia = copiarMultiplicando(origen, factor);
		System.out.println("Copia: " + copia);
	}

	// Copia cada valor de origen multiplicado por factor. Una lista null da lista vacía.
	private static List<Integer> copiarMultiplicando(List<Integer> origen, int factor) {
		List<Integer> destino = new ArrayList<>();
		if (origen == null) {
			return destino;
		}
		for (int valor : origen) {
			destino.add(valor * factor);
		}
		return destino;
	}
}
