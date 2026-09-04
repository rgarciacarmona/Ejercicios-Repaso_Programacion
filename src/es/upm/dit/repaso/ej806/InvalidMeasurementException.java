package es.upm.dit.repaso.ej806;

/** Ejercicio 8.6: excepción propia para valores no válidos en Measurement. */
public class InvalidMeasurementException extends Exception {

	public InvalidMeasurementException(String mensaje) {
		super(mensaje);
	}
}
