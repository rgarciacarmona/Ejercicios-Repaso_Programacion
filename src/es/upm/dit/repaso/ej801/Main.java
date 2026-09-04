package es.upm.dit.repaso.ej801;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Ejercicio 8.1: Lee un archivo de texto línea por línea y muestra el contenido
 * por pantalla.
 */
public class Main {

	private static final String RUTA_ARCHIVO = "datos.txt";

	public static void main(String[] args) {
		try {
			List<String> lineas = Files.readAllLines(Path.of(RUTA_ARCHIVO));
			for (String linea : lineas) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
