package es.upm.dit.repaso.ej5re12;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re12: concatena dos Lists de Characters.
 */
public class Main {

	public static void main(String[] args) {
		List<Character> primera = List.of('a', 'b', 'c');
		List<Character> segunda = List.of('x', 'y', 'z');
		List<Character> resultado = concatenar(primera, segunda);
		System.out.println("Concatenado: " + resultado);
	}

	// Une los elementos de primera y luego los de segunda en una lista nueva.
	private static List<Character> concatenar(List<Character> primera, List<Character> segunda) {
		List<Character> resultado = new ArrayList<>();
		if (primera != null) {
			resultado.addAll(primera);
		}
		if (segunda != null) {
			resultado.addAll(segunda);
		}
		return resultado;
	}
}
