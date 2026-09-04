package es.upm.dit.repaso.ej316;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 3.16: rellena una matriz cuadrada simétrica con valores aleatorios.
 */
public class Main {

	private static final int VALOR_MAXIMO = 100;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dimensión de la matriz: ");
		int dimension = teclado.nextInt();
		teclado.close();

		int[][] matriz = generarSimetrica(dimension);
		mostrar(matriz);
	}

	// Genera una matriz cuadrada donde matriz[i][j] == matriz[j][i].
	private static int[][] generarSimetrica(int dimension) {
		if (dimension <= 0) {
			return new int[0][0];
		}

		Random random = new Random();
		int[][] matriz = new int[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = i; j < dimension; j++) {
				int valor = random.nextInt(VALOR_MAXIMO);
				matriz[i][j] = valor;
				matriz[j][i] = valor;
			}
		}
		return matriz;
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
