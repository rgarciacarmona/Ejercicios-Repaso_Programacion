package es.upm.dit.repaso.ej5re02;

import java.util.List;

/**
 * Ejercicio 5.re02: busca un valor en una List de Integers no ordenada
 * y devuelve su posición, o -1 si no existe.
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> datos = List.of(5, 3, 9, 1, 7);
		int buscado = 9;
		int posicion = buscar(datos, buscado);
		System.out.println("Posición de " + buscado + ": " + posicion);
	}

	// Recorre la lista de principio a fin hasta encontrar el valor.
	private static int buscar(List<Integer> datos, int valor) {
		if (datos == null) {
			return -1;
		}
		for (int i = 0; i < datos.size(); i++) {
			if (datos.get(i) == valor) {
				return i;
			}
		}
		return -1;
	}
}
