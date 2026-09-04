package es.upm.dit.repaso.ej5re03;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re03: genera una List de 300 enteros donde cada posición
 * contiene su índice módulo 16 (0, 1, ..., 15, 0, 1, ...).
 */
public class Main {

	private static final int TAMANO = 300;
	private static final int MODULO = 16;

	public static void main(String[] args) {
		List<Integer> datos = generar();
		System.out.println(datos);
	}

	// Rellena una lista de TAMANO elementos con el índice módulo MODULO.
	private static List<Integer> generar() {
		List<Integer> datos = new ArrayList<>();
		for (int i = 0; i < TAMANO; i++) {
			datos.add(i % MODULO);
		}
		return datos;
	}
}
