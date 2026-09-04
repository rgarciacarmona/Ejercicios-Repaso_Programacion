package es.upm.dit.repaso.ej603;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Ejercicio 6.3: Añade 3 líneas de texto escritas por el usuario (Scanner)
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

			String textoAñadir = contenido.toString();
			Path ruta = Path.of(RUTA_ARCHIVO);
			if (Files.exists(ruta)) {
				String existente = Files.readString(ruta);
				Files.writeString(ruta, existente + textoAñadir);
			} else {
				Files.writeString(ruta, textoAñadir);
			}
			System.out.println("Líneas añadidas a " + RUTA_ARCHIVO);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
