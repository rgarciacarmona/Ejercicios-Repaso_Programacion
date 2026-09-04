package es.upm.dit.repaso.ej508;

import java.util.ArrayList;
import java.util.List;

/** Ejercicio 5.8: guarda medidas float en una List. */
public class Measurement {

	private List<Float> valores;

	public Measurement(List<Float> valores) {
		// Se copia la lista: si se guardara la recibida, quien la creó podría
		// cambiar sus valores más tarde y con ellos esta medida
		this.valores = new ArrayList<>(valores);
	}

	public List<Float> getValores() {
		return valores;
	}

	@Override
	public String toString() {
		return valores.toString();
	}

	// Dos medidas con los mismos valores son la misma medida. Sin equals() ni
	// hashCode() un HashSet las guardaría por separado y nunca detectaría repetidas
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Measurement)) {
			return false;
		}
		return valores.equals(((Measurement) obj).valores);
	}

	@Override
	public int hashCode() {
		return valores.hashCode();
	}
}
