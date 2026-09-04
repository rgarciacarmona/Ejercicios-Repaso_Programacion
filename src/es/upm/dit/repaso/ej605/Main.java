package es.upm.dit.repaso.ej605;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Ejercicio 6.5: Cuenta las líneas de un archivo y muestra el resultado.
 */
public class Main {

	private static final String RUTA_ARCHIVO = "datos.txt";

	public static void main(String[] args) {
		try {
			List<String> lineas = Files.readAllLines(Path.of(RUTA_ARCHIVO));
			System.out.println("El archivo contiene " + lineas.size() + " líneas.");
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
