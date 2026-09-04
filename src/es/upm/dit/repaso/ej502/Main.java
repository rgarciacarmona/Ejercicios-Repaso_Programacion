package es.upm.dit.repaso.ej502;

/** Ejercicio 5.2: crea varios Measurements y los muestra con toString(). */
public class Main {

	public static void main(String[] args) {
		Measurement m1 = new Measurement(new float[] { 1.0f, 2.5f, 3.0f, 4.25f });
		Measurement m2 = new Measurement(new float[] { -1.5f, 0.0f, 10.0f, 5.5f });

		System.out.println(m1);
		System.out.println(m2);
	}
}
