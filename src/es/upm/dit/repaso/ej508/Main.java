package es.upm.dit.repaso.ej508;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/** Ejercicio 5.8: quita valores repetidos de la List de cada Measurement de un Set. */
public class Main {

	public static void main(String[] args) {
		Set<Measurement> medidas = crearMedidasEjemplo();
		System.out.println("Antes: " + medidas);

		for (Measurement medida : medidas) {
			quitarDuplicados(medida);
		}

		System.out.println("Después: " + medidas);
	}

	// Elimina valores repetidos dentro de la List de la medida, conservando el orden.
	private static void quitarDuplicados(Measurement medida) {
		List<Float> valores = medida.getValores();
		if (valores == null) {
			return;
		}
		Set<Float> sinRepetidos = new LinkedHashSet<>(valores);
		valores.clear();
		valores.addAll(sinRepetidos);
	}

	private static Set<Measurement> crearMedidasEjemplo() {
		Set<Measurement> medidas = new HashSet<>();
		medidas.add(new Measurement(new ArrayList<>(Arrays.asList(1.0f, 2.5f, 1.0f, 4.25f))));
		medidas.add(new Measurement(new ArrayList<>(Arrays.asList(5.5f, 5.5f, 5.5f, 5.5f))));
		medidas.add(new Measurement(new ArrayList<>(Arrays.asList(2.0f, 3.0f, 4.0f, 5.0f))));
		return medidas;
	}
}
