package es.upm.dit.repaso.ej803;

/** Ejercicio 8.3: comprueba que MyDate rechaza fechas y días no válidos. */
public class Main {

	public static void main(String[] args) {
		try {
			new MyDate(31, 2, 2025);
			System.out.println("Error: no se lanzó excepción para 31/02/2025");
		} catch (IllegalArgumentException e) {
			System.out.println("Excepción esperada al crear 31/02/2025: " + e.getMessage());
		}

		MyDate fecha = new MyDate(15, 6, 2025);
		System.out.println("Fecha válida creada: " + fecha);

		try {
			fecha.setDay(35);
			System.out.println("Error: no se lanzó excepción para setDay(35)");
		} catch (IllegalArgumentException e) {
			System.out.println("Excepción esperada al llamar setDay(35): " + e.getMessage());
		}

		// Un setter también puede romper la fecha sin usar un valor absurdo:
		// el mes 2 es válido, pero no para un día 31
		try {
			new MyDate(31, 1, 2025).setMonth(2);
			System.out.println("Error: no se lanzó excepción para setMonth(2) sobre 31/01/2025");
		} catch (IllegalArgumentException e) {
			System.out.println("Excepción esperada al llamar setMonth(2) sobre 31/01/2025: "
					+ e.getMessage());
		}
	}
}
