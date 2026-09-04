package es.upm.dit.repaso.ej706;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 7.6: el Measurement de la sección 5, que ahora rechaza los valores
 * no válidos. Es aquí, y no en la sección 5, porque hasta ahora no se conocían
 * las excepciones: sin ellas un constructor no puede avisar de un error.
 */
public class Measurement {

	private List<Float> valores;

	public Measurement(List<Float> valores) throws InvalidMeasurementException {
		if (valores == null || valores.isEmpty()) {
			throw new InvalidMeasurementException("la lista de valores no puede ser nula ni estar vacía");
		}

		// Se copia la lista: si se guardara la recibida, quien la creó podría
		// cambiar sus valores más tarde y con ellos esta medida
		this.valores = new ArrayList<>(valores);
	}

	// Se devuelve una copia: quien recibiera la lista interna podría cambiar los
	// valores de una medida que ya se validó al crearla
	public List<Float> getValores() {
		return List.copyOf(valores);
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
