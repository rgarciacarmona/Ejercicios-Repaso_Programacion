package es.upm.dit.repaso.ej506;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Ejercicio 5.6: convierte un Set de Measurements en array y viceversa. */
public class Main {

	public static void main(String[] args) {
		Set<Measurement> medidas = crearMedidasEjemplo();
		System.out.println("Set original: " + medidas);

		Measurement[] array = medidas.toArray(new Measurement[0]);
		System.out.println("Array: " + Arrays.toString(array));

		Set<Measurement> medidasDesdeArray = new HashSet<>(Arrays.asList(array));
		System.out.println("Set reconstruido: " + medidasDesdeArray);
	}

	private static Set<Measurement> crearMedidasEjemplo() {
		Set<Measurement> medidas = new HashSet<>();
		medidas.add(new Measurement(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f)));
		medidas.add(new Measurement(Arrays.asList(-1.5f, 0.0f, 10.0f, 5.5f)));
		return medidas;
	}
}
