package es.upm.dit.repaso.ej803;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Ejercicio 8.3: Añade 3 líneas de texto escritas por el usuario (Scanner)
 * al final de un archivo.
 */
public class Main {

	private static final String RUTA_ARCHIVO = "notas.txt";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			StringBuilder contenido = new StringBuilder();
			for (int i = 0; i < 3; i++) {
				System.out.print("Línea " + (i + 1) + ": ");
				String linea = scanner.nextLine();
				contenido.append(linea).append("\n");
			}

			// APPEND escribe al final sin leer lo que ya hay; CREATE crea
			// el archivo la primera vez, así que no hace falta comprobar si existe
			Path ruta = Path.of(RUTA_ARCHIVO);
			Files.writeString(ruta, contenido.toString(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			System.out.println("Líneas añadidas a " + RUTA_ARCHIVO);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
