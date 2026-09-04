package es.upm.dit.repaso.ej503;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Ejercicio 5.3: crea Measurements con List<Float> y los muestra. */
public class Main {

	public static void main(String[] args) {
		List<Float> valores1 = new ArrayList<>(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f));
		List<Float> valores2 = new ArrayList<>(Arrays.asList(-1.5f, 0.0f, 10.0f, 5.5f));

		Measurement m1 = new Measurement(valores1);
		Measurement m2 = new Measurement(valores2);

		System.out.println(m1);
		System.out.println(m2);
	}
}
