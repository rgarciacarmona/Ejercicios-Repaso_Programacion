package es.upm.dit.repaso.ej802;

/** Ejercicio 8.2: excepción propia para líneas CSV mal formadas. */
public class FormatoCsvInvalidoException extends Exception {

	public FormatoCsvInvalidoException(String mensaje) {
		super(mensaje);
	}
}
