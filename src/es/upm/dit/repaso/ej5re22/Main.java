package es.upm.dit.repaso.ej5re22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio 5.re22: repite ej5re21 leyendo por teclado con "." o "," como separador decimal.
 */
public class Main {

	private static final int DESVIACIONES = 2;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Float> datos = leerDatos(teclado);
		teclado.close();

		int atipicos = contarAtipicos(datos);
		System.out.println("Elementos atípicos: " + atipicos);
	}

	// Lee números hasta una línea vacía; admite "." y "," como separador decimal.
	private static List<Float> leerDatos(Scanner teclado) {
		List<Float> datos = new ArrayList<>();
		System.out.println("Introduzca valores (línea vacía para terminar):");
		while (teclado.hasNextLine()) {
			String linea = teclado.nextLine().trim();
			if (linea.isEmpty()) {
				break;
			}
			datos.add(Float.parseFloat(linea.replace(',', '.')));
		}
		return datos;
	}

	// Cuenta cuántos valores están a más de DESVIACIONES desviaciones típicas de la media.
	private static int contarAtipicos(List<Float> datos) {
		if (datos == null || datos.isEmpty()) {
			return 0;
		}

		float media = media(datos);
		float desviacion = desviacionTipica(datos, media);
		if (desviacion == 0f) {
			return 0;
		}

		int atipicos = 0;
		for (float valor : datos) {
			if (Math.abs(valor - media) > DESVIACIONES * desviacion) {
				atipicos++;
			}
		}
		return atipicos;
	}

	private static float media(List<Float> datos) {
		float suma = 0f;
		for (float valor : datos) {
			suma += valor;
		}
		return suma / datos.size();
	}

	private static float desviacionTipica(List<Float> datos, float media) {
		float sumaCuadrados = 0f;
		for (float valor : datos) {
			sumaCuadrados += (valor - media) * (valor - media);
		}
		return (float) Math.sqrt(sumaCuadrados / datos.size());
	}
}
