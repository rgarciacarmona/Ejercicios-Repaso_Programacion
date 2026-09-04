package es.upm.dit.repaso.ej706;

/** Ejercicio 7.6: excepción propia para valores no válidos en Measurement. */
public class InvalidMeasurementException extends Exception {

	public InvalidMeasurementException(String mensaje) {
		super(mensaje);
	}
}
