package es.upm.dit.repaso.ej5re13;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re13: divide una List en segmentos (sublistas) de tamaño fijo.
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> datos = new ArrayList<>();
		for (int i = 0; i < 23; i++) {
			datos.add(i);
		}

		List<List<Integer>> segmentos = dividir(datos, 5);
		for (int i = 0; i < segmentos.size(); i++) {
			System.out.println("Segmento " + i + ": tamaño " + segmentos.get(i).size());
		}
	}

	// Trocea la lista en segmentos de "tamanio" elementos; el último puede ser más corto.
	private static List<List<Integer>> dividir(List<Integer> datos, int tamanio) {
		List<List<Integer>> segmentos = new ArrayList<>();
		if (datos == null || datos.isEmpty() || tamanio <= 0) {
			return segmentos;
		}

		int inicio = 0;
		while (inicio < datos.size()) {
			int fin = Math.min(inicio + tamanio, datos.size());
			segmentos.add(new ArrayList<>(datos.subList(inicio, fin)));
			inicio = fin;
		}
		return segmentos;
	}
}
