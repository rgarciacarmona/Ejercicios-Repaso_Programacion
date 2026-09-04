package es.upm.dit.repaso.ej601;

/** Ejercicio 6.1: crea dos puntos y los muestra por pantalla. */
public class Main {

	public static void main(String[] args) {
		Punto3D p1 = new Punto3D(12, 13, 18);
		Punto3D p2 = new Punto3D(8, 14, 0);

		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
	}
}
