package es.upm.dit.repaso.ej5re10;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re10: invierte una List de Characters in-place, sin usar
 * listas auxiliares (solo la List recibida como argumento).
 */
public class Main {

	public static void main(String[] args) {
		List<Character> datos = new ArrayList<>(List.of('a', 'b', 'c', 'd', 'e'));
		invertir(datos);
		System.out.println("Invertida: " + datos);
	}

	// Intercambia los extremos hacia el centro. Una lista null se ignora.
	private static void invertir(List<Character> datos) {
		if (datos == null) {
			return;
		}
		int izquierda = 0;
		int derecha = datos.size() - 1;
		while (izquierda < derecha) {
			char temporal = datos.get(izquierda);
			datos.set(izquierda, datos.get(derecha));
			datos.set(derecha, temporal);
			izquierda++;
			derecha--;
		}
	}
}
