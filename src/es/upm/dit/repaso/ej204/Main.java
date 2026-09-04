package es.upm.dit.repaso.ej204;

import java.util.Scanner;

/**
 * Ejercicio 204: Calcula el mínimo y máximo de números introducidos por
 * el usuario. Un número negativo señala el final (no se cuenta).
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca números enteros positivos (negativo para terminar):");

		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		boolean hayNumeros = false;

		while (true) {
			System.out.print("Número: ");
			int numero = sc.nextInt();

			if (numero < 0) {
				break;
			}

			hayNumeros = true;
			if (numero < minimo) {
				minimo = numero;
			}
			if (numero > maximo) {
				maximo = numero;
			}
		}

		sc.close();

		if (!hayNumeros) {
			System.out.println("No se introdujeron números positivos.");
		} else {
			System.out.println("Mínimo: " + minimo);
			System.out.println("Máximo: " + maximo);
		}
	}
}
