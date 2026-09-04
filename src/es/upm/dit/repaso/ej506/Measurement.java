package es.upm.dit.repaso.ej506;

import java.util.List;

/** Ejercicio 5.6: guarda medidas float en una List. */
public class Measurement {

	private List<Float> valores;

	public Measurement(List<Float> valores) {
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
