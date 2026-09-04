package es.upm.dit.repaso.ej602;

/** Ejercicio 6.2: crea una fecha y cambia el año con el setter. */
public class Main {

	public static void main(String[] args) {
		MyDate fecha = new MyDate(19, 9, 2025);
		System.out.println("Fecha: " + fecha);

		fecha.setYear(2026);
		System.out.println("Fecha tras cambiar el año: " + fecha);
	}
}
