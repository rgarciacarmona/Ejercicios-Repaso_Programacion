package es.upm.dit.repaso.ej607;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Ejercicio 6.7: Crea un directorio (carpeta) con un nombre de ejemplo.
 */
public class Main {

	private static final String NOMBRE_DIR = "miDirectorio";

	public static void main(String[] args) {
		try {
			Path ruta = Path.of(NOMBRE_DIR);
			Files.createDirectory(ruta);
			System.out.println("Directorio " + NOMBRE_DIR + " creado exitosamente.");
		} catch (IOException e) {
			System.out.println("Error al crear el directorio: " + e.getMessage());
		}
	}
}
