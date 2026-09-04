package es.upm.dit.repaso.ej5re05;

import java.util.List;

/**
 * Ejercicio 5.re05: calcula el promedio de una List de Floats.
 */
public class Main {

	public static void main(String[] args) {
		List<Float> datos = List.of(2.0f, 4.0f, 6.0f, 8.0f);
		float promedio = promedio(datos);
		System.out.println("El promedio es: " + promedio);
	}

	// Promedio de la lista. Una lista vacía o null da promedio 0.
	private static float promedio(List<Float> datos) {
		if (datos == null || datos.isEmpty()) {
			return 0f;
		}
		float suma = 0f;
		for (float valor : datos) {
			suma += valor;
		}
		return suma / datos.size();
	}
}
