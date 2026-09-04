package es.upm.dit.repaso.ej702;

/** Ejercicio 7.2: excepción propia para líneas CSV mal formadas. */
public class FormatoCsvInvalidoException extends Exception {

	public FormatoCsvInvalidoException(String mensaje) {
		super(mensaje);
	}
}
