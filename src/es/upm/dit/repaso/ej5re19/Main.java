package es.upm.dit.repaso.ej5re19;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re19: submuestrea una List de Integers conservando una muestra de cada "nivel".
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> muestras = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18);
		List<Integer> submuestreadas = submuestrear(muestras, 3);
		System.out.println(submuestreadas);
	}

	// Conserva una muestra de cada "nivel" (nivel 3 conserva 1 de cada 3).
	private static List<Integer> submuestrear(List<Integer> muestras, int nivel) {
		List<Integer> resultado = new ArrayList<>();
		if (muestras == null || nivel <= 0) {
			return resultado;
		}

		for (int i = 0; i < muestras.size(); i += nivel) {
			resultado.add(muestras.get(i));
		}
		return resultado;
	}
}
