package es.upm.dit.repaso.ej5re06;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re06: recibe una "matriz" como List de Lists de Floats (fila
 * y columna) y devuelve una List con el máximo de cada fila.
 */
public class Main {

	public static void main(String[] args) {
		List<List<Float>> matriz = List.of(
				List.of(1.0f, 5.0f, 3.0f),
				List.of(-2.0f, -8.0f, -1.0f),
				List.of(7.0f, 7.0f, 2.0f));
		List<Float> maximos = maximosPorFila(matriz);
		System.out.println("Máximos por fila: " + maximos);
	}

	// Calcula el máximo de cada fila. Una fila vacía o null no aporta máximo.
	private static List<Float> maximosPorFila(List<List<Float>> matriz) {
		List<Float> maximos = new ArrayList<>();
		if (matriz == null) {
			return maximos;
		}
		for (List<Float> fila : matriz) {
			maximos.add(maximoFila(fila));
		}
		return maximos;
	}

	// Máximo de una fila. Devuelve null si la fila está vacía o es null.
	private static Float maximoFila(List<Float> fila) {
		if (fila == null || fila.isEmpty()) {
			return null;
		}
		float maximo = fila.get(0);
		for (float valor : fila) {
			if (valor > maximo) {
				maximo = valor;
			}
		}
		return maximo;
	}
}
