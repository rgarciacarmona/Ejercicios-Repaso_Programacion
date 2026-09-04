package es.upm.dit.repaso.ej704;

import java.util.Scanner;

import es.upm.dit.repaso.ej704.Person.EstadoPeso;
import es.upm.dit.repaso.ej704.Person.Sexo;

/** Ejercicio 7.4: pide datos de 3 personas y muestra su informacion. */
public class Main {

	private static final int NUM_PERSONAS = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nombres = new String[NUM_PERSONAS];
		int[] edades = new int[NUM_PERSONAS];
		Sexo[] sexos = new Sexo[NUM_PERSONAS];
		double[] pesos = new double[NUM_PERSONAS];
		double[] alturas = new double[NUM_PERSONAS];
		DNI[] dnis = new DNI[NUM_PERSONAS];

		for (int i = 0; i < NUM_PERSONAS; i++) {
			System.out.println("--- Persona " + (i + 1) + " ---");
			System.out.print("Nombre: ");
			nombres[i] = sc.nextLine();
			System.out.print("Edad: ");
			edades[i] = Integer.parseInt(sc.nextLine().trim());
			System.out.print("Sexo (hombre/mujer): ");
			sexos[i] = "hombre".equalsIgnoreCase(sc.nextLine().trim()) ? Sexo.HOMBRE : Sexo.MUJER;
			System.out.print("Peso en kg: ");
			pesos[i] = Double.parseDouble(sc.nextLine().trim());
			System.out.print("Altura en m: ");
			alturas[i] = Double.parseDouble(sc.nextLine().trim());
			System.out.print("DNI (numero, numero+letra, o vacio para generarlo): ");
			dnis[i] = leerDni(sc.nextLine());
		}
		sc.close();

		// Tres constructores distintos: sin argumentos, nombre+edad+sexo y el completo.
		// Solo el constructor completo admite un DNI externo (DNI no tiene setter);
		// en los otros dos casos el DNI se autogenera.
		Person p1 = new Person();
		p1.setNombre(nombres[0]);
		p1.setEdad(edades[0]);
		p1.setSexo(sexos[0]);
		p1.setPeso(pesos[0]);
		p1.setAltura(alturas[0]);

		Person p2 = new Person(nombres[1], edades[1], sexos[1]);
		p2.setPeso(pesos[1]);
		p2.setAltura(alturas[1]);

		Person p3 = new Person(nombres[2], edades[2], dnis[2], sexos[2], pesos[2], alturas[2]);

		Person[] personas = { p1, p2, p3 };

		for (Person persona : personas) {
			mostrarEstadoPeso(persona);
		}

		for (Person persona : personas) {
			if (persona.isAdult()) {
				System.out.println(persona.getNombre() + " es mayor de edad.");
			}
		}

		for (Person persona : personas) {
			System.out.println(persona);
		}
	}

	private static void mostrarEstadoPeso(Person persona) {
		EstadoPeso estado = persona.evaluateWeight();
		if (estado == EstadoPeso.BAJO_PESO) {
			System.out.println(persona.getNombre() + " esta por debajo de su peso ideal.");
			return;
		}
		if (estado == EstadoPeso.SOBREPESO) {
			System.out.println(persona.getNombre() + " tiene sobrepeso.");
			return;
		}
		System.out.println(persona.getNombre() + " esta en su peso ideal.");
	}

	private static DNI leerDni(String texto) {
		String limpio = texto.trim();
		if (limpio.isEmpty()) {
			return new DNI();
		}
		if (Character.isLetter(limpio.charAt(limpio.length() - 1))) {
			return new DNI(limpio);
		}
		return new DNI(Integer.parseInt(limpio));
	}
}
