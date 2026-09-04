package es.upm.dit.repaso.ej704;

import java.util.Scanner;

import es.upm.dit.repaso.ej704.Person.EstadoPeso;
import es.upm.dit.repaso.ej704.Person.Sexo;

/** Ejercicio 7.4: pide datos de 3 personas y muestra su informacion. */
public class Main {

	private static final int NUM_PERSONAS = 3;

	// La primera persona se crea con el constructor por defecto, el unico que no
	// recibe DNI: el suyo se genera al azar y por eso no se le pide al usuario
	private static final int PRIMERA_CON_DNI = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nombres = new String[NUM_PERSONAS];
		int[] edades = new int[NUM_PERSONAS];
		Sexo[] sexos = new Sexo[NUM_PERSONAS];
		double[] pesos = new double[NUM_PERSONAS];
		double[] alturas = new double[NUM_PERSONAS];
		DNI[] dnis = new DNI[NUM_PERSONAS]; // dnis[0] no se usa: la persona 1 lo genera

		for (int i = 0; i < NUM_PERSONAS; i++) {
			System.out.println("--- Persona " + (i + 1) + " ---");
			System.out.print("Nombre: ");
			nombres[i] = sc.nextLine();
			System.out.print("Edad: ");
			edades[i] = Integer.parseInt(sc.nextLine().trim());
			System.out.print("Sexo (hombre/mujer): ");
			sexos[i] = "hombre".equalsIgnoreCase(sc.nextLine().trim()) ? Sexo.HOMBRE : Sexo.MUJER;
			pesos[i] = leerPositivo(sc, "Peso en kg: ");
			alturas[i] = leerPositivo(sc, "Altura en m: ");

			if (i >= PRIMERA_CON_DNI) {
				System.out.print("DNI (numero, numero+letra, o vacio para generarlo): ");
				dnis[i] = leerDni(sc.nextLine());
			}
		}
		sc.close();

		// Los tres constructores de Person: el vacio, el de nombre+edad+DNI+sexo
		// y el completo. Los valores que el constructor no asigna van por setters
		Person p1 = new Person();
		p1.setNombre(nombres[0]);
		p1.setEdad(edades[0]);
		p1.setSexo(sexos[0]);
		p1.setPeso(pesos[0]);
		p1.setAltura(alturas[0]);

		Person p2 = new Person(nombres[1], edades[1], dnis[1], sexos[1]);
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

	// Pide un numero hasta que sea mayor que 0: con un peso o una altura de 0
	// el IMC no da un numero y la persona quedaria mal clasificada.
	private static double leerPositivo(Scanner sc, String mensaje) {
		double valor;
		do {
			System.out.print(mensaje);
			valor = Double.parseDouble(sc.nextLine().trim());

			if (valor <= 0) {
				System.out.println("Escriba un numero mayor que 0.");
			}
		} while (valor <= 0);

		return valor;
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
