package es.upm.dit.repaso.ej504;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** Ejercicio 5.4: busca y muestra Measurements con un valor en un rango dado por el usuario. */
public class Main {

	public static void main(String[] args) {
		Set<Measurement> medidas = crearMedidasEjemplo();

		Scanner teclado = new Scanner(System.in);
		System.out.print("Límite inferior: ");
		float minimo = teclado.nextFloat();
		System.out.print("Límite superior: ");
		float maximo = teclado.nextFloat();
		teclado.close();

		System.out.println("Medidas con algún valor entre " + minimo + " y " + maximo + ":");
		for (Measurement medida : medidas) {
			if (contieneEnRango(medida, minimo, maximo)) {
				System.out.println(medida);
			}
		}
	}

	// Indica si la medida tiene al menos un valor dentro de [minimo, maximo].
	private static boolean contieneEnRango(Measurement medida, float minimo, float maximo) {
		if (medida.getValores() == null) {
			return false;
		}
		for (float valor : medida.getValores()) {
			if (valor >= minimo && valor <= maximo) {
				return true;
			}
		}
		return false;
	}

	private static Set<Measurement> crearMedidasEjemplo() {
		Set<Measurement> medidas = new HashSet<>();
		medidas.add(new Measurement(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f)));
		medidas.add(new Measurement(Arrays.asList(-1.5f, 0.0f, 10.0f, 5.5f)));
		medidas.add(new Measurement(Arrays.asList(20.0f, 21.0f, 22.0f, 23.0f)));
		return medidas;
	}
}
