package es.upm.dit.repaso.ej604;

import java.util.Scanner;

/** Ejercicio 6.4: genera un array de Password con las longitudes pedidas al usuario. */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero de contraseñas a generar: ");
		int tamano = Integer.parseInt(sc.nextLine().trim());

		Password[] contrasenas = new Password[tamano];
		boolean[] fuertes = new boolean[tamano];

		for (int i = 0; i < tamano; i++) {
			System.out.print("Longitud de la contraseña " + (i + 1) + ": ");
			int longitud = Integer.parseInt(sc.nextLine().trim());
			contrasenas[i] = new Password(longitud);
			fuertes[i] = contrasenas[i].isStrong();
		}
		sc.close();

		for (int i = 0; i < tamano; i++) {
			System.out.println(contrasenas[i].getPassword() + " : " + fuertes[i]);
		}
	}
}
