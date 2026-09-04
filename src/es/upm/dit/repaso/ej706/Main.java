package es.upm.dit.repaso.ej706;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** Ejercicio 7.6: crea un Measurement válido y captura el error al crear uno inválido. */
public class Main {

	public static void main(String[] args) {
		try {
			Measurement valido = new Measurement(Arrays.asList(1.5f, 2.5f, 3.5f));
			System.out.println("Measurement válido creado: " + valido);
		} catch (InvalidMeasurementException e) {
			System.out.println("Error inesperado: " + e.getMessage());
		}

		crearInvalido(Collections.emptyList());
		crearInvalido(null);
	}

	// Intenta crear una medida que no cumple las condiciones y muestra el error.
	private static void crearInvalido(List<Float> valores) {
		try {
			new Measurement(valores);
			System.out.println("Error: no se lanzó excepción para " + valores);
		} catch (InvalidMeasurementException e) {
			System.out.println("Excepción esperada para " + valores + ": " + e.getMessage());
		}
	}
}
