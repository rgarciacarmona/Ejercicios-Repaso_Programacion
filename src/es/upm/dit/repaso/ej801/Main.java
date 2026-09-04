package es.upm.dit.repaso.ej801;

import java.util.ArrayList;
import java.util.List;

/** Ejercicio 8.1: convierte un array de Strings con decimales en un array de floats. */
public class Main {

	public static void main(String[] args) {
		String[] textos = { "3.14", "2.5", "abc", "10", "-7.2", "" };

		float[] valores = convertir(textos);

		System.out.print("Valores convertidos: ");
		for (float valor : valores) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}

	// Convierte cada texto a float. Si un texto no es un número válido,
	// se avisa por consola y se omite (no se incluye en el array resultado).
	private static float[] convertir(String[] textos) {
		List<Float> validos = new ArrayList<>();

		for (String texto : textos) {
			try {
				validos.add(Float.parseFloat(texto));
			} catch (NumberFormatException e) {
				System.out.println("Valor no válido, se omite: \"" + texto + "\"");
			}
		}

		float[] resultado = new float[validos.size()];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = validos.get(i);
		}
		return resultado;
	}
}
