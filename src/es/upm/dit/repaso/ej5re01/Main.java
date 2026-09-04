package es.upm.dit.repaso.ej5re01;

import java.util.List;

/**
 * Ejercicio 5.re01: suma los elementos de una List de Floats.
 */
public class Main {

	public static void main(String[] args) {
		List<Float> datos = List.of(1.5f, 2.0f, -3.25f, 4.0f);
		float suma = sumar(datos);
		System.out.println("La suma es: " + suma);
	}

	// Suma todos los elementos de la lista. Una lista vacía o null suma 0.
	private static float sumar(List<Float> datos) {
		if (datos == null) {
			return 0f;
		}
		float suma = 0f;
		for (float valor : datos) {
			suma += valor;
		}
		return suma;
	}
}
