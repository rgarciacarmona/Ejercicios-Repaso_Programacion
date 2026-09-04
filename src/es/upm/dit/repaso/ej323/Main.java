package es.upm.dit.repaso.ej323;

import java.util.Scanner;

/**
 * Ejercicio 3.23: multiplica dos matrices de enteros leídas por teclado.
 */
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Matriz A:");
		int[][] matrizA = leerMatriz(teclado);
		System.out.println("Matriz B:");
		int[][] matrizB = leerMatriz(teclado);
		teclado.close();

		if (!sonCompatibles(matrizA, matrizB)) {
			System.out.println("Dimensiones no compatibles para multiplicar.");
			return;
		}

		int[][] resultado = multiplicar(matrizA, matrizB);

		System.out.println("Matriz A:");
		mostrar(matrizA);
		System.out.println("Matriz B:");
		mostrar(matrizB);
		System.out.println("A x B:");
		mostrar(resultado);
	}

	private static int[][] leerMatriz(Scanner teclado) {
		System.out.print("Filas: ");
		int filas = teclado.nextInt();
		System.out.print("Columnas: ");
		int columnas = teclado.nextInt();

		int[][] matriz = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("Valor [" + i + "][" + j + "]: ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		return matriz;
	}

	// Para multiplicar A x B, columnas de A deben coincidir con filas de B.
	private static boolean sonCompatibles(int[][] matrizA, int[][] matrizB) {
		if (matrizA.length == 0 || matrizB.length == 0) {
			return false;
		}
		return matrizA[0].length == matrizB.length;
	}

	private static int[][] multiplicar(int[][] matrizA, int[][] matrizB) {
		int filas = matrizA.length;
		int columnas = matrizB[0].length;
		int intermedio = matrizB.length;

		int[][] resultado = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int suma = 0;
				for (int k = 0; k < intermedio; k++) {
					suma += matrizA[i][k] * matrizB[k][j];
				}
				resultado[i][j] = suma;
			}
		}
		return resultado;
	}

	private static void mostrar(int[][] matriz) {
		for (int[] fila : matriz) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}
}
