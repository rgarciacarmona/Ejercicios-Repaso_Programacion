package es.upm.dit.repaso.ej5re21;

import java.util.List;

/**
 * Ejercicio 5.re21: cuenta los elementos de una List de Floats a más de 2 desviaciones típicas de la media.
 */
public class Main {

	private static final int DESVIACIONES = 2;

	public static void main(String[] args) {
		List<Float> datos = List.of(10f, 12f, 11f, 9f, 50f, 10f, 13f, -30f);
		int atipicos = contarAtipicos(datos);
		System.out.println("Elementos atípicos: " + atipicos);
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
