package es.upm.dit.repaso.ej208;

import java.util.Scanner;

/**
 * Ejercicio 208: Calcula el producto escalar de dos vectores
 * tridimensionales introducidos por el usuario.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca las componentes del primer vector 3D:");
		double[] v1 = leerVector(sc);

		System.out.println("Introduzca las componentes del segundo vector 3D:");
		double[] v2 = leerVector(sc);

		sc.close();

		double productoEscalar = calcularProductoEscalar(v1, v2);
		System.out.println("\nProducto escalar: " + productoEscalar);
	}

	// Lee un vector de 3 componentes desde el usuario
	private static double[] leerVector(Scanner sc) {
		double[] vector = new double[3];
		String[] nombres = { "X", "Y", "Z" };

		for (int i = 0; i < 3; i++) {
			System.out.print("Componente " + nombres[i] + ": ");
			vector[i] = sc.nextDouble();
		}

		return vector;
	}

	// Calcula el producto escalar (dot product) de dos vectores
	private static double calcularProductoEscalar(double[] v1, double[] v2) {
		double resultado = 0.0;
		for (int i = 0; i < 3; i++) {
			resultado += v1[i] * v2[i];
		}
		return resultado;
	}
}
