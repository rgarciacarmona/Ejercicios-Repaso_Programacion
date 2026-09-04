package es.upm.dit.repaso.ej5re11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio 5.re11: pide enteros por teclado hasta introducir 0, los
 * guarda en una List y calcula media, mínimo y máximo (sin contar el 0).
 */
public class Main {

	private static final int FIN = 0;

	public static void main(String[] args) {
		List<Integer> datos = leerDatos();
		if (datos.isEmpty()) {
			System.out.println("No se introdujo ningún dato.");
			return;
		}
		System.out.println("Media: " + media(datos));
		System.out.println("Mínimo: " + minimo(datos));
		System.out.println("Máximo: " + maximo(datos));
	}

	// Lee enteros de teclado hasta que el usuario introduce FIN.
	private static List<Integer> leerDatos() {
		List<Integer> datos = new ArrayList<>();
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduce números enteros (0 para terminar):");
			int valor = teclado.nextInt();
			while (valor != FIN) {
				datos.add(valor);
				valor = teclado.nextInt();
			}
		}
		return datos;
	}

	// Media de los datos. La lista no está vacía cuando se llama.
	private static double media(List<Integer> datos) {
		int suma = 0;
		for (int valor : datos) {
			suma += valor;
		}
		return (double) suma / datos.size();
	}

	private static int minimo(List<Integer> datos) {
		int minimo = datos.get(0);
		for (int valor : datos) {
			if (valor < minimo) {
				minimo = valor;
			}
		}
		return minimo;
	}

	private static int maximo(List<Integer> datos) {
		int maximo = datos.get(0);
		for (int valor : datos) {
			if (valor > maximo) {
				maximo = valor;
			}
		}
		return maximo;
	}
}
