package es.upm.dit.repaso.ej501;

import java.util.Arrays;

/** Ejercicio 5.1: guarda 4 medidas float. */
public class Measurement {

	private float[] valores;

	public Measurement(float[] valores) {
		// Se copia el array: si se guardara el recibido, quien lo creó podría
		// cambiar sus valores más tarde y con ellos esta medida
		this.valores = Arrays.copyOf(valores, valores.length);
	}

	// Se devuelve una copia: quien recibiera el array interno podría cambiar los
	// valores de la medida, y el Set que la contuviera dejaría de encontrarla
	public float[] getValores() {
		return Arrays.copyOf(valores, valores.length);
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
		return Arrays.equals(valores, ((Measurement) obj).valores);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(valores);
	}
}
