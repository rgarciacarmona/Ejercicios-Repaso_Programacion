package es.upm.dit.repaso.ej608;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Ejercicio 6.8: Lista todos los archivos con extensión ".txt" de un directorio.
 */
public class Main {

	private static final String RUTA_DIR = ".";

	public static void main(String[] args) {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Path.of(RUTA_DIR), "*.txt")) {
			System.out.println("Archivos .txt encontrados:");
			for (Path archivo : stream) {
				System.out.println(archivo.getFileName());
			}
		} catch (IOException e) {
			System.out.println("Error al listar los archivos: " + e.getMessage());
		}
	}
}
