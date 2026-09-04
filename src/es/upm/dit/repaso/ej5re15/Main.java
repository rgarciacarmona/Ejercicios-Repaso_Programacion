package es.upm.dit.repaso.ej5re15;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re15: extrae los máximos locales de una List de Floats.
 */
public class Main {

	public static void main(String[] args) {
		List<Float> datos = List.of(1f, 5f, 2f, 8f, 3f, 3f, 9f, 4f);
		List<Float> maximos = maximosLocales(datos);
		System.out.println(maximos);
	}

	// Un elemento es máximo local si supera a su anterior y a su siguiente.
	// Los extremos de la lista nunca pueden serlo.
	private static List<Float> maximosLocales(List<Float> datos) {
		List<Float> maximos = new ArrayList<>();
		if (datos == null || datos.size() < 3) {
			return maximos;
		}

		for (int i = 1; i < datos.size() - 1; i++) {
			float actual = datos.get(i);
			if (actual > datos.get(i - 1) && actual > datos.get(i + 1)) {
				maximos.add(actual);
			}
		}
		return maximos;
	}
}
