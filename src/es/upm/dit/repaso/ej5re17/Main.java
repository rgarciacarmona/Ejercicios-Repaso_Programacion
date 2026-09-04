package es.upm.dit.repaso.ej5re17;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re17: filtra una List de Floats dejando solo los valores que superan un umbral.
 */
public class Main {

	public static void main(String[] args) {
		List<Float> datos = List.of(1.5f, 4.2f, -3f, 7.8f, 2.1f);
		List<Float> filtrados = filtrarPorUmbral(datos, 2f);
		System.out.println(filtrados);
	}

	// Se queda solo con los valores estrictamente mayores que "umbral".
	private static List<Float> filtrarPorUmbral(List<Float> datos, float umbral) {
		List<Float> filtrados = new ArrayList<>();
		if (datos == null) {
			return filtrados;
		}

		for (float valor : datos) {
			if (valor > umbral) {
				filtrados.add(valor);
			}
		}
		return filtrados;
	}
}
