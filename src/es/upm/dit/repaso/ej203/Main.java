package es.upm.dit.repaso.ej203;

/**
 * Ejercicio 203: Suma y cuenta de múltiplos de 5 entre 1 y 100.
 * Muestra cada múltiplo y el resultado final.
 */
public class Main {

	public static void main(String[] args) {
		int suma = 0;
		int contador = 0;

		System.out.println("Múltiplos de 5 entre 1 y 100:");
		for (int i = 5; i <= 100; i += 5) {
			System.out.print(i + " ");
			suma += i;
			contador++;
		}

		System.out.println("\n\nCantidad de múltiplos: " + contador);
		System.out.println("Suma total: " + suma);
	}
}
