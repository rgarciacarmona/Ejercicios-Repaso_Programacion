package es.upm.dit.repaso.ej806;

import java.util.Arrays;
import java.util.Collections;

/** Ejercicio 8.6: crea un Measurement válido y captura el error al crear uno inválido. */
public class Main {

	public static void main(String[] args) {
		try {
			Measurement valido = new Measurement(Arrays.asList(1.5f, 2.5f, 3.5f));
			System.out.println("Measurement válido creado: " + valido);
		} catch (InvalidMeasurementException e) {
			System.out.println("Error inesperado: " + e.getMessage());
		}

		try {
			new Measurement(Collections.emptyList());
			System.out.println("Error: no se lanzó excepción para lista vacía");
		} catch (InvalidMeasurementException e) {
			System.out.println("Excepción esperada al crear Measurement inválido: " + e.getMessage());
		}
	}
}
