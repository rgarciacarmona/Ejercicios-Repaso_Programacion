package es.upm.dit.repaso.ej322;

import java.util.Scanner;

/**
 * Ejercicio 3.22: como 3.21, pero admite "." o "," como separador decimal.
 */
public class Main {

	private static final int DESVIACIONES = 2;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cantidad de valores: ");
		int cantidad = Integer.parseInt(teclado.nextLine().trim());

		float[] datos = new float[cantidad];
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Valor " + i + ": ");
			datos[i] = leerFloat(teclado.nextLine());
		}
		teclado.close();

		System.out.println("Elementos alejados: " + contarAlejados(datos));
	}

	// Admite coma o punto como separador decimal.
	private static float leerFloat(String texto) {
		String normalizado = texto.trim().replace(',', '.');
		return Float.parseFloat(normalizado);
	}

	// Cuenta los valores cuya distancia a la media supera 2 desviaciones típicas.
	private static int contarAlejados(float[] datos) {
		if (datos == null || datos.length == 0) {
			return 0;
		}

		float media = media(datos);
		float desviacion = desviacionTipica(datos, media);

		int cantidad = 0;
		for (float valor : datos) {
			if (Math.abs(valor - media) > DESVIACIONES * desviacion) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private static float media(float[] datos) {
		float suma = 0f;
		for (float valor : datos) {
			suma += valor;
		}
		return suma / datos.length;
	}

	private static float desviacionTipica(float[] datos, float media) {
		float sumaCuadrados = 0f;
		for (float valor : datos) {
			sumaCuadrados += (valor - media) * (valor - media);
		}
		return (float) Math.sqrt(sumaCuadrados / datos.length);
	}
}
