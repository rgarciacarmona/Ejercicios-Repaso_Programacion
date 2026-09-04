package es.upm.dit.repaso.ej5re23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio 5.re23: multiplica dos matrices de enteros representadas como List de Lists.
 */
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Matriz A:");
		List<List<Integer>> matrizA = leerMatriz(teclado);
		System.out.println("Matriz B:");
		List<List<Integer>> matrizB = leerMatriz(teclado);
		teclado.close();

		if (!dimensionesCompatibles(matrizA, matrizB)) {
			System.out.println("Dimensiones incompatibles: columnas de A != filas de B");
			return;
		}

		List<List<Integer>> resultado = multiplicar(matrizA, matrizB);
		System.out.println("Matriz A:");
		mostrar(matrizA);
		System.out.println("Matriz B:");
		mostrar(matrizB);
		System.out.println("A x B:");
		mostrar(resultado);
	}

	// Pide filas, columnas y valores de una matriz por teclado.
	private static List<List<Integer>> leerMatriz(Scanner teclado) {
		System.out.print("Filas: ");
		int filas = teclado.nextInt();
		System.out.print("Columnas: ");
		int columnas = teclado.nextInt();

		List<List<Integer>> matriz = new ArrayList<>();
		for (int i = 0; i < filas; i++) {
			List<Integer> fila = new ArrayList<>();
			for (int j = 0; j < columnas; j++) {
				System.out.print("Valor [" + i + "][" + j + "]: ");
				fila.add(teclado.nextInt());
			}
			matriz.add(fila);
		}
		return matriz;
	}

	// Multiplicar A(m,n) por B(n,p) requiere columnas de A == filas de B.
	private static boolean dimensionesCompatibles(List<List<Integer>> a, List<List<Integer>> b) {
		if (a.isEmpty() || b.isEmpty()) {
			return false;
		}
		return a.get(0).size() == b.size();
	}

	private static List<List<Integer>> multiplicar(List<List<Integer>> a, List<List<Integer>> b) {
		int filas = a.size();
		int columnas = b.get(0).size();
		int comun = b.size();

		List<List<Integer>> resultado = new ArrayList<>();
		for (int i = 0; i < filas; i++) {
			List<Integer> fila = new ArrayList<>();
			for (int j = 0; j < columnas; j++) {
				int suma = 0;
				for (int k = 0; k < comun; k++) {
					suma += a.get(i).get(k) * b.get(k).get(j);
				}
				fila.add(suma);
			}
			resultado.add(fila);
		}
		return resultado;
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
