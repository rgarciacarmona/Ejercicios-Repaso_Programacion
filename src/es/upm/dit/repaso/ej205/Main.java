package es.upm.dit.repaso.ej205;

/**
 * Ejercicio 205: Muestra la tabla de multiplicar de los 10 primeros
 * números naturales (del 1 al 10).
 */
public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
