package es.upm.dit.repaso.ej706;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** Ejercicio 7.6: plantilla de empresa y sueldos calculados por polimorfismo. */
public class Main {

	private static final int NUM_JEFES = 2;
	private static final int NUM_VIAJANTES = 5;
	private static final int NUM_EMPLEADOS = 15;
	private static final int RANGO_ALEATORIO = 11; // genera valores de 0 a 10

	public static void main(String[] args) {
		Random random = new Random();
		List<Empleado> plantilla = new ArrayList<>();

		for (int i = 1; i <= NUM_JEFES; i++) {
			plantilla.add(new Jefe("Jefe" + i, random.nextInt(RANGO_ALEATORIO)));
		}
		for (int i = 1; i <= NUM_VIAJANTES; i++) {
			plantilla.add(new Viajante("Viajante" + i, random.nextInt(RANGO_ALEATORIO)));
		}
		for (int i = 1; i <= NUM_EMPLEADOS; i++) {
			plantilla.add(new Empleado("Empleado" + i));
		}

		// Polimorfismo: cada empleado calcula su sueldo con su propia formula
		for (Empleado empleado : plantilla) {
			System.out.println(empleado);
		}
	}
}
