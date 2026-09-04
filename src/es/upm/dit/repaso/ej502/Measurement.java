package es.upm.dit.repaso.ej502;

/** Ejercicio 5.2: guarda 4 medidas float y las muestra con toString(). */
public class Measurement {

	private float[] valores;

	public Measurement(float[] valores) {
		this.valores = valores;
	}

	public float[] getValores() {
		return valores;
	}

	@Override
	public String toString() {
		StringBuilder texto = new StringBuilder("[");
		for (int i = 0; i < valores.length; i++) {
			if (i > 0) {
				texto.append(", ");
			}
			texto.append(valores[i]);
		}
		texto.append("]");
		return texto.toString();
	}
}
