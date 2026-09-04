package es.upm.dit.repaso.ej703;

/** Ejercicio 7.3: demostracion fija de suma, multiplicacion y simplificacion. */
public class Main {

	// Se opta por una demostracion fija (sin menu por consola) para simplificar la interaccion.
	public static void main(String[] args) {
		Racional cero = new Racional();
		System.out.println("racional por defecto -> " + cero);

		Racional r1 = new Racional(1, 2);
		Racional r2 = new Racional(2, 3);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r1 + r2 = " + r1.sumar(r2));
		System.out.println("r1 * r2 = " + r1.multiplicar(r2));

		Racional r3 = new Racional(4, 8);
		System.out.println("4/8 simplificado -> " + r3);

		Racional copia = new Racional(r1);
		System.out.println("copia de r1 -> " + copia);
	}
}
