package es.upm.dit.repaso.ej206;

/**
 * Ejercicio 206: Muestra la lista de los 100 primeros números primos.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Los 100 primeros números primos:");

		int contador = 0;
		int numero = 2;

		while (contador < 100) {
			if (esPrimo(numero)) {
				System.out.print(numero + " ");
				contador++;
				if (contador % 10 == 0) {
					System.out.println();
				}
			}
			numero++;
		}

		System.out.println();
	}

	// Verifica si un número es primo
	private static boolean esPrimo(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
