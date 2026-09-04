package es.upm.dit.repaso.ej806;

import java.util.List;

/** Ejercicio 8.6: guarda medidas float en una List, exigiendo una lista no vacía. */
public class Measurement {

	private List<Float> valores;

	public Measurement(List<Float> valores) throws InvalidMeasurementException {
		if (valores == null || valores.isEmpty()) {
			throw new InvalidMeasurementException("la lista de valores no puede ser nula ni estar vacía");
		}
		this.valores = valores;
	}

	public List<Float> getValores() {
		return valores;
	}

	@Override
	public String toString() {
		return valores.toString();
	}
}
