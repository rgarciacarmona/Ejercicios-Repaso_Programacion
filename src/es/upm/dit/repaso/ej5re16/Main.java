package es.upm.dit.repaso.ej5re16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 5.re16: rellena una matriz cuadrada (List de Lists) simétrica con valores aleatorios.
 */
public class Main {

	private static final int VALOR_MAXIMO = 100;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dimensión de la matriz: ");
		int dimension = teclado.nextInt();
		teclado.close();

		List<List<Integer>> matriz = generarSimetrica(dimension);
		mostrar(matriz);
	}

	// Genera una matriz cuadrada donde matriz.get(i).get(j) == matriz.get(j).get(i).
	private static List<List<Integer>> generarSimetrica(int dimension) {
		List<List<Integer>> matriz = new ArrayList<>();
		if (dimension <= 0) {
			return matriz;
		}

		for (int i = 0; i < dimension; i++) {
			matriz.add(new ArrayList<>(Collections.nCopies(dimension, 0)));
		}

		Random random = new Random();
		for (int i = 0; i < dimension; i++) {
			for (int j = i; j < dimension; j++) {
				int valor = random.nextInt(VALOR_MAXIMO);
				matriz.get(i).set(j, valor);
				matriz.get(j).set(i, valor);
			}
		}
		return matriz;
	}

	private static void mostrar(List<List<Integer>> matriz) {
		for (List<Integer> fila : matriz) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}
}
