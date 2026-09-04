package es.upm.dit.repaso.ej5re20;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re20: interpola una List de Integers insertando la media entre cada dos muestras.
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> muestras = List.of(10, 20, 30, 40);
		List<Integer> interpoladas = interpolar(muestras);
		System.out.println(interpoladas);
	}

	// Entre cada dos muestras consecutivas inserta una nueva con su media.
	private static List<Integer> interpolar(List<Integer> muestras) {
		List<Integer> resultado = new ArrayList<>();
		if (muestras == null || muestras.isEmpty()) {
			return resultado;
		}

		for (int i = 0; i < muestras.size() - 1; i++) {
			int actual = muestras.get(i);
			int siguiente = muestras.get(i + 1);
			resultado.add(actual);
			resultado.add((actual + siguiente) / 2);
		}
		resultado.add(muestras.get(muestras.size() - 1));
		return resultado;
	}
}
