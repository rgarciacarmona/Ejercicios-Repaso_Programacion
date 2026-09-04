package es.upm.dit.repaso.ej207;

import java.util.Scanner;

/**
 * Ejercicio 207: Descompone un número entero en factores primos.
 * El usuario introduce el número y se muestra su factorización.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número entero: ");
		int numero = sc.nextInt();
		sc.close();

		if (numero <= 1) {
			System.out.println("El número debe ser mayor que 1.");
			return;
		}

		System.out.print(numero + " = ");
		descomponer(numero);
		System.out.println();
	}

	// Descompone un número en sus factores primos
	private static void descomponer(int n) {
		int original = n;
		boolean primera = true;

		// Dividir por 2 mientras sea posible
		while (n % 2 == 0) {
			if (!primera) {
				System.out.print(" x ");
			}
			System.out.print("2");
			n /= 2;
			primera = false;
		}

		// Probar factores impares desde 3
		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				if (!primera) {
					System.out.print(" x ");
				}
				System.out.print(i);
				n /= i;
				primera = false;
			}
		}

		// Si n > 1, es un factor primo
		if (n > 1) {
			if (!primera) {
				System.out.print(" x ");
			}
			System.out.print(n);
		}
	}
}
