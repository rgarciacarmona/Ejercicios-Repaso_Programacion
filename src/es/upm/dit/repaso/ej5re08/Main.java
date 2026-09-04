package es.upm.dit.repaso.ej5re08;

import java.util.List;

/**
 * Ejercicio 5.re08: cuenta los valores negativos en una List de Floats.
 */
public class Main {

	public static void main(String[] args) {
		List<Float> datos = List.of(3.0f, -1.5f, 0.0f, -7.2f, 2.2f);
		int negativos = contarNegativos(datos);
		System.out.println("Valores negativos: " + negativos);
	}

	// Cuenta los elementos estrictamente menores que 0.
	private static int contarNegativos(List<Float> datos) {
		if (datos == null) {
			return 0;
		}
		int negativos = 0;
		for (float valor : datos) {
			if (valor < 0) {
				negativos++;
			}
		}
		return negativos;
	}
}
