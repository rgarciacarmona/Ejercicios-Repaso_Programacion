package es.upm.dit.repaso.ej5re14;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re14: normaliza una List de Floats entre -1 y 1.
 */
public class Main {

	public static void main(String[] args) {
		List<Float> datos = List.of(4f, -8f, 2f, -1f, 6f);
		List<Float> normalizado = normalizar(datos);
		for (float valor : normalizado) {
			System.out.println(valor);
		}
	}

	// Divide cada valor por el máximo absoluto de la lista.
	private static List<Float> normalizar(List<Float> datos) {
		List<Float> normalizado = new ArrayList<>();
		if (datos == null || datos.isEmpty()) {
			return normalizado;
		}

		float maximo = 0f;
		for (float valor : datos) {
			float absoluto = Math.abs(valor);
			if (absoluto > maximo) {
				maximo = absoluto;
			}
		}
		if (maximo == 0f) {
			normalizado.addAll(datos);
			return normalizado;
		}

		for (float valor : datos) {
			normalizado.add(valor / maximo);
		}
		return normalizado;
	}
}
