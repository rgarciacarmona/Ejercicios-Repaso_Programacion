package es.upm.dit.repaso.ej507;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Ejercicio 5.7: combina dos Sets de Measurements en un tercero. */
public class Main {

	public static void main(String[] args) {
		Set<Measurement> setA = new HashSet<>();
		setA.add(new Measurement(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f)));
		setA.add(new Measurement(Arrays.asList(-1.5f, 0.0f, 10.0f, 5.5f)));

		Set<Measurement> setB = new HashSet<>();
		setB.add(new Measurement(Arrays.asList(20.0f, 21.0f, 22.0f, 23.0f)));

		Set<Measurement> union = combinar(setA, setB);

		System.out.println("Set A: " + setA);
		System.out.println("Set B: " + setB);
		System.out.println("Unión: " + union);
	}

	// Une los elementos de ambos Sets en uno nuevo, sin modificar los originales.
	private static Set<Measurement> combinar(Set<Measurement> a, Set<Measurement> b) {
		Set<Measurement> union = new HashSet<>();
		if (a != null) {
			union.addAll(a);
		}
		if (b != null) {
			union.addAll(b);
		}
		return union;
	}
}
