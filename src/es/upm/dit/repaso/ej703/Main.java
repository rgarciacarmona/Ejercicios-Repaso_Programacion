package es.upm.dit.repaso.ej703;

import java.util.Scanner;

/** Ejercicio 7.3: calculadora de racionales con las operaciones en un menu. */
public class Main {

	private static final int SUMAR = 1;
	private static final int MULTIPLICAR = 2;
	private static final int SALIR = 3;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Los otros dos constructores, el vacio y el de copia, en una linea
		Racional cero = new Racional();
		System.out.println("Racional por defecto: " + cero + ", copia: " + new Racional(cero));

		int opcion = SALIR;
		do {
			mostrarMenu();
			opcion = leerEntero(teclado, "Opcion: ");
			if (opcion == SUMAR || opcion == MULTIPLICAR) {
				operar(teclado, opcion);
			}
		} while (opcion != SALIR);

		teclado.close();
		System.out.println("Hasta luego.");
	}

	private static void mostrarMenu() {
		System.out.println();
		System.out.println(SUMAR + ") Sumar");
		System.out.println(MULTIPLICAR + ") Multiplicar");
		System.out.println(SALIR + ") Salir");
	}

	// Pide dos racionales, aplica la operacion elegida y muestra el resultado,
	// que el constructor de Racional ya devuelve simplificado.
	private static void operar(Scanner teclado, int opcion) {
		Racional r1 = leerRacional(teclado, "Primer racional");
		Racional r2 = leerRacional(teclado, "Segundo racional");

		if (opcion == SUMAR) {
			System.out.println(r1 + " + " + r2 + " = " + r1.sumar(r2));
			return;
		}
		System.out.println(r1 + " * " + r2 + " = " + r1.multiplicar(r2));
	}

	// Pide numerador y denominador hasta que formen un racional valido.
	private static Racional leerRacional(Scanner teclado, String nombre) {
		while (true) {
			System.out.println(nombre + ":");
			int numerador = leerEntero(teclado, "  Numerador: ");
			int denominador = leerEntero(teclado, "  Denominador: ");

			try {
				return new Racional(numerador, denominador);
			} catch (IllegalArgumentException e) {
				System.out.println("  " + e.getMessage());
			}
		}
	}

	// Pide un entero hasta que la entrada sea un numero.
	private static int leerEntero(Scanner teclado, String mensaje) {
		while (true) {
			System.out.print(mensaje);
			try {
				return Integer.parseInt(teclado.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Escriba un numero entero.");
			}
		}
	}
}
