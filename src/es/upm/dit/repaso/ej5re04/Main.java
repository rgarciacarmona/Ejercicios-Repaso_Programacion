package es.upm.dit.repaso.ej5re04;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re04: genera una List de 300 Characters con la representación
 * hexadecimal del índice módulo 16 (0, 1, ..., 9, A, B, ..., F, 0, 1, ...).
 */
public class Main {

	private static final int TAMANO = 300;
	private static final int MODULO = 16;
	private static final char[] DIGITOS_HEX = "0123456789ABCDEF".toCharArray();

	public static void main(String[] args) {
		List<Character> datos = generar();
		System.out.println(datos);
	}

	// Rellena una lista de TAMANO elementos con el dígito hexadecimal del índice módulo MODULO.
	private static List<Character> generar() {
		List<Character> datos = new ArrayList<>();
		for (int i = 0; i < TAMANO; i++) {
			datos.add(DIGITOS_HEX[i % MODULO]);
		}
		return datos;
	}
}
