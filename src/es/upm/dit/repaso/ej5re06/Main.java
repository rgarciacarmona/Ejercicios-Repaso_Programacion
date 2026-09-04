package es.upm.dit.repaso.ej5re06;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re06: recibe una "matriz" como List de Lists de Floats (fila
 * y columna) y devuelve una List con el máximo de cada fila.
 */
public class Main {

	public static void main(String[] args) {
		// La última fila está vacía a propósito: cada fila es una List aparte, así
		// que puede tener una longitud distinta, incluso 0
		List<List<Float>> matriz = List.of(
				List.of(1.0f, 5.0f, 3.0f),
				List.of(-2.0f, -8.0f, -1.0f),
				List.of(7.0f, 7.0f, 2.0f),
				List.of());
		List<Float> maximos = maximosPorFila(matriz);
		System.out.println("Máximos por fila: " + maximos);
	}

	// Calcula el máximo de cada fila: la posición i del resultado es el máximo de
	// la fila i. Una fila vacía o null ocupa su sitio con un null, así que hay que
	// recorrer el resultado con "for (Float valor : maximos)", nunca con float:
	// un null no se puede convertir en float.
	private static List<Float> maximosPorFila(List<List<Float>> matriz) {
		List<Float> maximos = new ArrayList<>();
		if (matriz == null) {
			return maximos;
		}
		for (List<Float> fila : matriz) {
			// Saltarse las filas sin máximo adelantaría un puesto a todas las
			// siguientes y el resultado dejaría de decir a qué fila pertenece cada
			// máximo
			maximos.add(maximoFila(fila));
		}
		return maximos;
	}

	// Máximo de una fila.
	//
	// Caso límite fácil de pasar por alto: una fila puede estar vacía o ser null,
	// y entonces no hay ningún máximo que devolver. Aquí sí se puede avisar con
	// null, porque Float es un objeto (en el ejercicio 3.6, con float, hacía
	// falta recurrir a NaN).
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
