package es.upm.dit.repaso.ej501;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** Ejercicio 5.1: crea un Set de Measurements introducidos por el usuario. */
public class Main {

	private static final int NUM_MEDIDAS = 10;
	private static final int VALORES_POR_MEDIDA = 4;

	public static void main(String[] args) {
		Set<Measurement> medidas = new HashSet<>();
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < NUM_MEDIDAS; i++) {
			System.out.println("Medida " + (i + 1) + ":");
			float[] valores = new float[VALORES_POR_MEDIDA];
			for (int j = 0; j < VALORES_POR_MEDIDA; j++) {
				System.out.print("  Valor " + (j + 1) + ": ");
				valores[j] = teclado.nextFloat();
			}
			medidas.add(new Measurement(valores));
		}

		System.out.println("Se han añadido " + medidas.size() + " medidas al Set.");
		teclado.close();
	}
}
