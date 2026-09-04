package es.upm.dit.repaso.ej5re09;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re09: invierte el orden de los elementos de una List de
 * Characters, devolviendo una lista nueva.
 */
public class Main {

	public static void main(String[] args) {
		List<Character> datos = List.of('a', 'b', 'c', 'd');
		List<Character> invertida = invertir(datos);
		System.out.println("Invertida: " + invertida);
	}

	// Construye una lista nueva con los elementos en orden inverso.
	private static List<Character> invertir(List<Character> datos) {
		List<Character> invertida = new ArrayList<>();
		if (datos == null) {
			return invertida;
		}
		for (int i = datos.size() - 1; i >= 0; i--) {
			invertida.add(datos.get(i));
		}
		return invertida;
	}
}
